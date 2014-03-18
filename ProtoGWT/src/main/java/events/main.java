package events;

import com.espertech.esper.client.EPServiceProvider;
import com.espertech.esper.client.EPServiceProviderManager;
import com.espertech.esper.client.EPStatement;

public class main {
  private static EPServiceProvider epService;

  public static void main(String[] args) {
    epService = EPServiceProviderManager.getDefaultProvider();
    String expression = "select count(1) from events.OrderEvent.win:time(6 sec) where price > 100";
    EPStatement statement = epService.getEPAdministrator().createEPL(expression);

    MyListener listener = new MyListener();
    statement.addListener(listener);

    OrderEvent event = new OrderEvent("shirt", 50);
    epService.getEPRuntime().sendEvent(event);

    new java.util.Timer().schedule(new java.util.TimerTask() {
      @Override
      public void run() {
        OrderEvent event = new OrderEvent("shirt", 101);
        epService.getEPRuntime().sendEvent(event);
      }
    }, 5000);
  }
}
