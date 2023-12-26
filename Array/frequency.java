import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frequencyMap = findFrequency(array);

        System.out.println("Element : Frequency");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }

    public static Map<Integer, Integer> findFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int element : arr) {
            if (frequency.containsKey(element)) {
                frequency.put(element, frequency.get(element) + 1);
            } else {
                frequency.put(element, 1);
            }
        }

        return frequency;
    }
}
