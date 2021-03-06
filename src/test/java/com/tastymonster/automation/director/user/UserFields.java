package com.tastymonster.automation.director.user;

import com.tastymonster.automation.director.base.AbstractFields;
import com.tastymonster.automation.director.base.IDirectorFields;
import com.tastymonster.automation.element.base.IClickable;
import com.tastymonster.automation.element.base.IDiv;
import com.tastymonster.automation.element.base.ITextBox;
import com.tastymonster.automation.page.base.BaseCreateUserPage;

public class UserFields extends AbstractFields implements IDirectorFields {
	protected final BaseCreateUserPage page = newPage( BaseCreateUserPage.class );

	public final IClickable btnSubmit = page.btnSubmit;
	public final ITextBox securityQuestionField = page.securityQuestionField;
	public final ITextBox lastNameField = page.lastNameField;
	public final IDiv wrapper = page.wrapper;
	public final ITextBox phoneField = page.phoneField;
	public final ITextBox emailField = page.emailField;
	public final ITextBox firstNameField = page.firstNameField;
	public final ITextBox securityAnswerField = page.securityAnswerField;
	
	public UserFields() {
		super.fields.add( securityAnswerField );
		fields.add( lastNameField );
		fields.add( phoneField );
		fields.add( emailField );
		fields.add( firstNameField );
		fields.add( securityAnswerField );
	};
	
}
