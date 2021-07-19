public class FlagPrinter {
    public void printOutFlag()
    {
        String outputLine;
        for (int row = 1; row <= 40; row++){
            outputLine = "";
            for (int column = 1; column <= 40; column++){
                outputLine = outputLine+determineCharacter(column, row);
            }
            System.out.println(outputLine);
        }

    }

    public char determineCharacter (int column, int row)
    {
        if(column <= 2 || column >= 39){
            return '?';
        }
        if(row <= 2 || row >= 39){
            return '?';
        }
        if(column == (41-row)) {
              return '+';
        }
        if((row <= 16) && (column == 17)){
            return '|';
        }
        if((row == 17) && (column <= 17)){
            return '-';
        }
        if((row <= 16) && (column <=16)){
            if((row+ column)%3 == 0){
                return '/';}
            if((row+ column)%3 == 1){
                return '=';}
            /*if((row+ column) == (7))
                return '=';
            if((row+ column) == (10))
                return '=';
            if((row+ column) == (13))
                return '=';
            if((row+ column) == (16))
                return '=';
            if((row+ column) == (19))
                return '=';
            if((row+ column) == (22))
                return '=';
            if((row+ column) == (25))
                return '=';
            if((row+ column) == (28))
                return '=';
            if((row+ column) == (31))
                return '=';*/
        else{
                return ' ';}

        }
        if((column <= (41-row))) {
            if (column % 5 == 0) {
                return '(';
            }
        }
        if((column >= (41-row))) {
            if (row % 3 == 0) {
                return ')';
            }
        }
        return ' ';
    }
}

