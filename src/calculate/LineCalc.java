package calculate;

import data.Line2D;

public class LineCalc {

    public double lineLenght(Line2D line){
        return Math.sqrt((line.getEndPointX() - line.getStartPointX() * (line.getEndPointX() - line.getStartPointX())
                + (line.getEndPointY() - line.getStartPointY()) * (line.getEndPointY() - line.getStartPointY())));
    }
}
