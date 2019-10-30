package com.ontrack.ontrack_faq;

public class QnA {

    private String question;
    private String answer;
    private boolean expanded;

    public QnA(String question, String answer) {
        this.question = question;
        this.answer= answer;
        this.expanded= false;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }


    @Override
    public String toString() {
        return "QnA{" +
                "Questions='" + question + '\'' +
                ", Answer='" + answer + '\'' +
                ", expanded=" + expanded +
                '}';
    }
}
