package session_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Survey {
    private String id;
    private String title;
    private String topic;
    private String description;

    //questionList - lista e pyetjeve ne survey
    private ArrayList<Question> questionList = new ArrayList<>();

    //candidateList - lista e kandidateve qe plotesojne pyetesorin
    private ArrayList<Candidate> candidateList = new ArrayList<>();


    public String getId() {
        return id;
    }

    public ArrayList<Candidate> getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(ArrayList<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Survey(String title) {
        this.title = title;
    }
    public Survey(String title, String topic, String description) {
        this.title = title;
        this.topic = topic;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getTopic() {
        return topic;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }

    public void removeQuestion(Question q){
        questionList.remove(q);
    }
}
