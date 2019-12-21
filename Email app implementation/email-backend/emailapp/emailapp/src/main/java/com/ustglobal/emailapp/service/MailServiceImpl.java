package com.ustglobal.emailapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.emailapp.dao.MailDAO;
import com.ustglobal.emailapp.dto.Mail_Info;
import com.ustglobal.emailapp.dto.User_Info;
@Service
public class MailServiceImpl implements MailService{
	@Autowired
	private MailDAO dao;

	@Override
	public boolean composeMail(Mail_Info mail, User_Info to_id, User_Info from_id) {
		
		return dao.composeMail(mail, to_id, from_id);
	}

	@Override
	public boolean deleteMail(int mid) {
	return dao.deleteMail(mid);
	}

	@Override
	public boolean draftMail(Mail_Info mail, User_Info to_id, User_Info from_id) {
		
		return dao.draftMail(mail, to_id, from_id);
	}

	@Override
	public List<Mail_Info> inbox() {
		
		return dao.inbox();
	}
}
