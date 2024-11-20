package bai3;
import java.util.HashMap;
public class WordCounter {
    public static void main(String[] args) {
        // Mảng các chuỗi ban đầu
        String[] sentences = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };

        // HashMap để lưu số lần xuất hiện của từ
        HashMap<Integer, String> wordCount = new HashMap<>();

        int totalWords = 0;

        // Đọc qua từng chuỗi trong mảng
        for (String sentence : sentences) {
            // Tách chuỗi thành các từ dựa trên khoảng trắng
            String[] words = sentence.split(" ");

            for (String word : words) {
                // Tăng số lần xuất hiện của từ trong HashMap
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                totalWords++;
            }
        }

        // Hiển thị số lần xuất hiện của từng từ
        for (String word : wordCount.keySet()) {
            System.out.println(word + " : " + wordCount.get(word));
        }

        // Hiển thị tổng số từ
        System.out.println("Total words: " + totalWords);
    }
}
