import java.util.*;

public class MaximumWatchlistScore {

    static class Movie {
        int duration;
        int rating;

        Movie(int duration, int rating) {
            this.duration = duration;
            this.rating = rating;
        }
    }

    public static long maxScore(int[] duration, int[] rating, int limit) {

        int n = duration.length;

        Movie[] movies = new Movie[n];

        for (int i = 0; i < n; i++) {
            movies[i] = new Movie(duration[i], rating[i]);
        }

        // Sort according to rating in descending order
        Arrays.sort(movies, (a, b) -> b.rating - a.rating);

        // Min heap stores selected durations
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        long durationSum = 0;
        long maxScore = 0;

        for (Movie movie : movies) {

            // Add current movie duration
            minHeap.offer(movie.duration);
            durationSum += movie.duration;

            // Select at most limit movies
            if (minHeap.size() > limit) {
                durationSum -= minHeap.poll();
            }

            // Current rating is minimum rating
            long score = durationSum * movie.rating;

            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }

    public static void main(String[] args) {

        int[] duration = {3, 5, 2, 4};
        int[] rating = {4, 3, 5, 2};

        int limit = 2;

        System.out.println(maxScore(duration, rating, limit));
    }
}