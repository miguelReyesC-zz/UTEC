package devteamcool.client.ui;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class PntlRegistrarNotas extends Composite {
  @UiTemplate("PntlRegistrarNotas.ui.xml")
  interface PntlRegistrarNotasUiBinder extends UiBinder<Widget, PntlRegistrarNotas> {
  }

  private static PntlRegistrarNotasUiBinder uiBinder = GWT.create(PntlRegistrarNotasUiBinder.class);

  @UiField
  ListBox ddPrograma;
  @UiField
  ListBox ddArea;
  @UiField
  ListBox ddProducto;
  @UiField
  ListBox ddCurso;
  @UiField
  ListBox ddSeccion;
  @UiField
  ListBox ddTipoSesion;

  public PntlRegistrarNotas() {
    initWidget(uiBinder.createAndBindUi(this));

    ddPrograma.addItem("Carrera Profesional");
    ddPrograma.addItem("Diplomado");
    ddPrograma.addItem("Maestría");

    ddArea.addItem("Administración");
    ddArea.addItem("Ciencias");
    ddArea.addItem("Ingeniería");
    ddArea.setSelectedIndex(2);

    ddProducto.addItem("Carrera de Ing. de la Energía");

    ddCurso.addItem("Investigación de Operaciones");

    ddSeccion.addItem("A");
    ddSeccion.addItem("B");
    ddSeccion.setSelectedIndex(1);

    ddTipoSesion.addItem("Teoría");
    ddTipoSesion.addItem("Práctica");
  }
}
