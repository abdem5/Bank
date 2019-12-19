package Bank.Service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CommonServiceImpl implements CommonService{

	// �ݱ�
	@Override
	public void WindowClose(ActionEvent event) {
		Parent parent = (Parent)event.getSource();
		Stage stage = (Stage)parent.getScene().getWindow();
		stage.close();
	}
	@Override
	public void WindowClose(Parent parent) {
		Stage stage = (Stage)parent.getScene().getWindow();
		stage.close();
	}

	// �޼��� �ڽ�
	@Override
	public void ErrorMsg(String title, String head, String contents) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle(title);
		alert.setHeaderText(head);
		alert.setContentText(contents);
		alert.show();
	}
	@Override
	public void ErrorMsg(String head, String contents) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText(head);
		alert.setContentText(contents);
		alert.show();
	}
	@Override
	public void ErrorMsg(String contents) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setContentText(contents);
		alert.show();
	}
	@Override
	public void InfoMsg(String title, String head, String contents) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle(title);
		alert.setHeaderText(head);
		alert.setContentText(contents);
		alert.show();
	}
	@Override
	public void InfoMsg(String head, String contents) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText(head);
		alert.setContentText(contents);
		alert.show();
	}
	@Override
	public void InfoMsg(String contents) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setContentText(contents);
		alert.show();
	}
	
	// ������ 
	@Override
	public TextField GetTextField(Parent membershipForm, String id) {
		TextField textField = (TextField)membershipForm.lookup(id);
		return textField;
	}
	@Override
	public RadioButton GetRadioButton(Parent membershipForm, String id) {
		RadioButton radioButton = (RadioButton)membershipForm.lookup(id);
		return radioButton;
	}
	@Override
	public CheckBox GetCheckBox(Parent membershipForm, String id) {
		CheckBox checkBox = (CheckBox)membershipForm.lookup(id);
		return checkBox;
	}
	@Override
	public ComboBox<String> GetComboBox(Parent membershipForm, String id) {
		ComboBox<String> comboBox = (ComboBox<String>)membershipForm.lookup(id);
		return comboBox;
	}
}
