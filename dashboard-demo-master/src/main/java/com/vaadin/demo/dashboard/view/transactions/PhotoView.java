package com.vaadin.demo.dashboard.view.transactions;

import org.vaadin.juho.imageupload.client.ImageUpload;

import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class PhotoView extends VerticalLayout {

	
	ImageUpload fileUpload = new ImageUpload();

	public PhotoView() {
		Panel p = new Panel();
		p.setContent(buildPhotoButton());

		
		addComponent(p);

	}
	
	private Button buildPhotoButton(){
		Button takePhotoButton = new Button("Fotoğraf");
		takePhotoButton.setClickShortcut(KeyCode.ENTER);
		takePhotoButton.focus();
		takePhotoButton.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(final ClickEvent event) {

				fileUpload.click();

			}
		});
		
		return takePhotoButton;

	}

}



