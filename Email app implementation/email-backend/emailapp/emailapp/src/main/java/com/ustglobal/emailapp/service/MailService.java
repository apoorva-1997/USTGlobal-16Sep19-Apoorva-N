package com.ustglobal.emailapp.service;

import java.util.List;

import com.ustglobal.emailapp.dto.Mail_Info;
import com.ustglobal.emailapp.dto.User_Info;

public interface MailService {
	public boolean composeMail(Mail_Info mail, User_Info to_id, User_Info from_id);
	public boolean deleteMail(int mid);
	public boolean draftMail(Mail_Info mail, User_Info to_id, User_Info from_id);
	public List<Mail_Info> inbox();
}
