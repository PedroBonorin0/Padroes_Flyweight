package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TimeFactory {
  private static Map<String, Time> times = new HashMap<>();

  public static Time getTime(String nome) {
    Time time = times.get(nome);
    if (time == null) {
      time = new Time(nome);
      times.put(nome, time);
    }
    return time;
  }

  public static int getTotalTimes() {
    return times.size();
  }

}