class FrequencyTracker {
private Map<Integer, Integer> freqMap; // map of number to frequency
private Map<Integer, Integer> countMap; // map of frequency to count

public FrequencyTracker() {
        freqMap = new HashMap<>();
        countMap = new HashMap<>();
        }

public void add(int number) {
        int freq = freqMap.getOrDefault(number, 0);
        int newFreq = freq + 1;
        freqMap.put(number, newFreq);
        countMap.put(newFreq, countMap.getOrDefault(newFreq, 0) + 1);
        if (freq > 0) {
        countMap.put(freq, countMap.get(freq) - 1);
        if (countMap.get(freq) == 0) {
        countMap.remove(freq);
        }
        }
        }

public void deleteOne(int number) {
        int freq = freqMap.getOrDefault(number, 0);
        if (freq > 0) {
        freqMap.put(number, freq - 1);
        countMap.put(freq, countMap.get(freq) - 1);
        if (countMap.get(freq) == 0) {
        countMap.remove(freq);
        }
        if (freq > 1) {
        countMap.put(freq - 1, countMap.getOrDefault(freq - 1, 0) + 1);
        }
        }
        }

public boolean hasFrequency(int frequency) {
        return countMap.containsKey(frequency);
        }
        }
