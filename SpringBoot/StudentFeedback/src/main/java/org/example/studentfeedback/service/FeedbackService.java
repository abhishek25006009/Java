
package org.example.studentfeedback.service;

import org.example.studentfeedback.model.Feedback;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedbackService {

    private final List<Feedback> feedbackList = new ArrayList<>();

    public Feedback addFeedback(Feedback feedback) {
        feedbackList.add(feedback);
        return feedback;
    }

    public List<Feedback> getAllFeedback() {
        return feedbackList;
    }
}
