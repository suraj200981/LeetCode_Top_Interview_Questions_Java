package Easy;

public class MostWordsFound {

  public MostWordsFound(){

  }

  public int mostWordsFoundQuadraticSolution(String[] sentences) {

    int count= 0;
    int biggestSentence = 0;

    for(int x=0; x<sentences.length; x++){
      count=1;

      String currentSentence = sentences[x];
      char [] charArr = currentSentence.toCharArray();
      for(int y=0; y<charArr.length; y++){
        if(charArr[y]==' ') {
          count++;
        }

      }
      if(count>biggestSentence){
        biggestSentence = count;
      }

    }

    return biggestSentence;
  }
}
