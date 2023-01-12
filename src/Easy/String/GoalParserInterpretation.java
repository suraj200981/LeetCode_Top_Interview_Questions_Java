package Easy.String;

public class GoalParserInterpretation {
  public GoalParserInterpretation() {
  }

  public String interpret(String command) {
    return command.replace("()","o" ).replace("(al)","al");
  }

}
