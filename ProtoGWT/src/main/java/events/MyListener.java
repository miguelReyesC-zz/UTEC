package events;

import com.espertech.esper.client.EventBean;
import com.espertech.esper.client.UpdateListener;

public class MyListener implements UpdateListener {

  public void update(EventBean[] newEvents, EventBean[] oldEvents) {
    EventBean event = newEvents[0];
    System.out.println("Big orders" + event.get("count(1)"));
  }

}
