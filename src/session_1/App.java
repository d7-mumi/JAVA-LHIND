package session_1;
import java.util.HashMap;

public class App implements surveyReports{

    @Override
    public String getMostChosenAnswer(Survey s) {
        return null;
    }

    @Override
    public HashMap<Question, Integer> getAnsForAllQuestions(Survey s) {
        return null;
    }

    @Override
    public String[] getAnsByCandidate(Candidate ca) {
        return new String[0];
    }

    @Override
    public Candidate getCandidateThatTakesMostSurveys() {
        return null;
    }

    @Override
    public boolean checkIfQuestionIsAnsweredByLessThan50(Question q) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
