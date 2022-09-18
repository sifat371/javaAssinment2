import java.util.Objects;

public class UnitConvert {

    String fromConvert;
    String toConvert;
    double result;
    double value;

    public double getResult() {
        return result;
    }

    public UnitConvert(String fromConvert, String toConvert, double value) {
        this.fromConvert = fromConvert;
        this.toConvert = toConvert;
        this.value = value;
        if (Objects.equals(fromConvert, "mi")){
            if (Objects.equals(toConvert, "km")){
                result = value * 1.609;
            } else if (Objects.equals(toConvert, "m")) {
                result = value * 1609;
            } else if (Objects.equals(toConvert, "cm")) {
                result = value * 160900;
            }
        }
        else if (Objects.equals(fromConvert, "lb")) {
            if (Objects.equals(toConvert, "kg")){
                result = value / 2.205;
            }
            if (Objects.equals(toConvert, "g")){
                result = value * 453.6;
            }
        }
        else if (Objects.equals(fromConvert, "ft")){
            if (Objects.equals(toConvert, "km")){
                result = value / 3281;
            } else if (Objects.equals(toConvert, "m")) {
                result = value /  3.281;
            } else if (Objects.equals(toConvert, "cm")) {
                result = value * 30.48;
            }
        }
        else if (Objects.equals(fromConvert, "in")){
            if (Objects.equals(toConvert, "km")){
                result = value / 39370;
            } else if (Objects.equals(toConvert, "m")) {
                result = value / 39.37;
            } else if (Objects.equals(toConvert, "cm")) {
                result = value * 2.54;
            }
        }
        else if (Objects.equals(fromConvert, "oz")) {
            if (Objects.equals(toConvert, "kg")){
                result = value / 35.274;
            }
            if (Objects.equals(toConvert, "g")){
                result = value * 28.35;
            }
        }
    }

}
