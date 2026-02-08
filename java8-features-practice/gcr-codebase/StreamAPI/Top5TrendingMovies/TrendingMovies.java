package Top5TrendingMovies;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrendingMovies {

	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
	            new Movie("Movie A", 8.9, 2024),
	            new Movie("Movie B", 9.1, 2023),
	            new Movie("Movie C", 8.5, 2024),
	            new Movie("Movie D", 9.3, 2025),
	            new Movie("Movie E", 8.7, 2022),
	            new Movie("Movie F", 9.0, 2025),
	            new Movie("Movie G", 7.9, 2024)
	    );
		
		Stream<Movie> filteredMovies = movies.stream().filter(m -> m.getRating()>=8.5);
		
		Stream<Movie> sortedMovies = filteredMovies.sorted(Comparator.comparing(Movie::getRating).reversed()).limit(5);
		
		List<Movie> top5Movie = sortedMovies.collect(Collectors.toList());
		
		top5Movie.forEach(m ->
            System.out.println(
                m.getName() + " | " + m.getRating() + " | " + m.getReleaseYear()
        ));

	}

}
