package session_1;

import java.util.HashMap;

public interface surveyReports {

    public String getMostChosenAnswer(Survey s);
    public HashMap<Question, Integer> getAnsForAllQuestions(Survey s);
    public String[] getAnsByCandidate(Candidate ca);
    public Candidate getCandidateThatTakesMostSurveys();
    public boolean checkIfQuestionIsAnsweredByLessThan50(Question q);

}

