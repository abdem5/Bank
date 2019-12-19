package Bank.Service;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public interface CommonService {
	// ������ ����
	public void WindowClose(ActionEvent event);
	public void WindowClose(Parent parent);
	
	// �޼��� ���
	public void ErrorMsg(String title, String head, String contents);
	public void ErrorMsg(String head, String contents);
	public void ErrorMsg(String contents);
	public void InfoMsg(String title, String head, String contents);
	public void InfoMsg(String head, String contents);
	public void InfoMsg(String contents);
	
	// FXML Value ��������
	public TextField GetTextField(Parent membershipForm, String id);
	public RadioButton GetRadioButton(Parent membershipForm, String id);
	public CheckBox GetCheckBox(Parent membershipForm, String id);
	public ComboBox<String> GetComboBox(Parent membershipForm, String id);
}
