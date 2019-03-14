package com.revature.services;

import java.util.List;

import com.revature.dtos.AssociateInterview;
import com.revature.dtos.NewAssociateInput;
import com.revature.dtos.NewInterviewData;
import com.revature.models.Interview;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.revature.dtos.AssociateInterview;
import com.revature.dtos.FeedbackData;
import com.revature.models.Interview;
import com.revature.models.InterviewFeedback;
import com.revature.models.User;

public interface InterviewService {

	Interview save(Interview i);
	Interview update(Interview i);
	Interview delete(Interview i);
	Interview findById(int id);
	
	List<Interview> findAll();
	Interview addNewInterview(NewInterviewData i);
	Interview addAssociateInput(NewAssociateInput a);
	Interview findById(int i);
	Page<Interview> findAll(Pageable page);
	List<AssociateInterview> findInterviewsPerAssociate();
	Page<AssociateInterview> findInterviewsPerAssociate(Pageable page);
	Interview setFeedback(FeedbackData f);
	List<User> getAssociateNeedFeedback();
	Page<User> getAssociateNeedFeedback(Pageable page);
	Integer[] getAssociateNeedFeedbackChart();
	InterviewFeedback getInterviewFeedbackByInterviewID(int interviewId);
	Interview markReviewed(int interviewId);
}
