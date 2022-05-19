package org.vashonsd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {
    String team;
    String raceName;
    int length;
    private Map<String, Double> times = new HashMap<>();

    public Race(String raceName) {
        this.raceName = raceName;
    }

    public Race(String team, String raceName, int length, Map<String, Double> times) {
        this.team = team;
        this.raceName = raceName;
        this.length = length;
        this.times = times;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Map<String, Double> getTimes() {
        return times;
    }

    public void setTimes(Map<String, Double> times) {
        this.times = times;
    }

    public void addResult(String who, Double time) {
        times.put(who, time);
    }

    public String nameOfWinner() {
        //Loop through the Map and find the lowest time.
        double winTime = Integer.MAX_VALUE;
        String winnerPerson = "";

        for (String person : times.keySet()) {

           if(times.get(person) < winTime) {
               winTime = times.get(person);

           }
        }

        for (String person : times.keySet()) {
            if (times.get(person) == winTime) {
                winnerPerson = person;
            }
        }

        return winnerPerson;
    }
    /* Given a cutoff time, return a list of all those whose race time was under that time.
    *
     */
    public List<String> timeUnder(Double cutoffTime) {
        List<String> results = new ArrayList<String>();
        for (String person : times.keySet()) {
            //If this person's time is under cutoffTime, then add that person's name to results.
            if (times.get(person) <= cutoffTime) {
                results.add(person);
            }
        }
        return results;
    }
}