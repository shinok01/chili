package info.yalamanchili.gwt.composite;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.Widget;

public abstract class CreateComposite<T> extends ReadUpdateCreateComposite
		implements ClickListener {
	


	public Button create = new Button("CREATE");

	public void initCreateComposite() {
		init();
		panel.add(create);
		create.addClickListener(this);
	}

	protected abstract void createButtonClicked();

	public void onClick(Widget widget) {
		if (widget == create)
			createButtonClicked();
	}
}
