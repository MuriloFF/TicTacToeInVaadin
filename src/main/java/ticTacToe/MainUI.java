package ticTacToe;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("tictactoeinvaadintheme")
@Push(value = PushMode.AUTOMATIC)
public class MainUI extends UI {
	private static final long serialVersionUID = 1L;

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout vl = new VerticalLayout();
		vl.setMargin(true);
		vl.addComponent(new Label("Hello world"));
		setContent(vl);

		Button b = new Button("Test");
		vl.addComponent(b);

		b.addClickListener((c) -> {
			new Notification("Teste", "Description", Notification.Type.WARNING_MESSAGE).show(Page.getCurrent());
		});
	}

}
