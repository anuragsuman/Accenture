package com.job.steamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person(String name) {
		this.name = name;
	}
	
	Person(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
}

class Foo {
	String name;
	List<Bar> bars = new ArrayList<>();

	Foo(String name) {
		this.name = name;
	}
}

class Bar {
	String name;

	Bar(String name) {
		this.name = name;
	}
}

class Outer {
	Nested nested;
}

class Nested {
	Inner inner;
}

class Inner {
	String foo;
}


public class StreamAPIWithListMap {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		List<Person> persons =
				Arrays.asList(
						new Person("Max", 18),
						new Person("Peter", 23),
						new Person("Pamela", 23),
						new Person("David", 12));
		
		List<Person> pers = persons.stream().map(pee->  new Person(pee.getAge())).collect(Collectors.toList());
		
		
		pers.forEach(e->System.out.println(e.age));

		myList
		.stream()
		.filter(s -> s.startsWith("c")) //to filter the list
		.map(String::toUpperCase) // to manipulate the list
		.sorted(Comparator.reverseOrder()) //to short the list in reverse order
		.forEach(System.out::println);
		
		System.out.println("=====================================================================");

		Arrays.asList("a1", "a2", "a3")
		.stream()
		.findFirst()
		.ifPresent(System.out::println);  // a1
		
		System.out.println("=====================================================================");

		Stream.of("a1", "a2", "a3")
		.findFirst()
		.ifPresent(System.out::println);  // a1
		
		System.out.println("=====================================================================");

		IntStream.range(1, 4)
		.forEach(System.out::println);
		
		System.out.println("=====================================================================");

		Arrays.stream(new int[] {1, 2, 3})
		.map(n -> 2 * n + 1)
		.average()
		.ifPresent(System.out::println);  // 5.0
		
		System.out.println("=====================================================================");

		Stream.of("a1", "a2", "a3")
		.map(s -> s.substring(1))
		.mapToInt(Integer::parseInt)
		.max()
		.ifPresent(System.out::println);  // 3
		
		System.out.println("=====================================================================");

		IntStream.range(1, 4)
		.mapToObj(i -> "a" + i)
		.forEach(System.out::println);
		
		System.out.println("=====================================================================");

		Stream.of(1.0, 2.0, 3.0)
		.mapToInt(Double::intValue)
		.mapToObj(i -> "a" + i)
		.forEach(System.out::println);
		
		System.out.println("=====================================================================");

		Stream.of("d2", "a2", "b1", "b3", "c")
		.filter(s -> {
			System.out.println("filter: " + s);
			return true;
		});

		System.out.println("=====================================================================");

		Stream.of("d2", "a2", "b1", "b3", "c")
		.filter(s -> {
			System.out.println("filter: " + s);
			return true;
		})
		.forEach(s -> System.out.println("forEach: " + s));


		//		  filter:  d2
		//		  forEach: d2
		//		  filter:  a2
		//		  forEach: a2
		//		  filter:  b1
		//		  forEach: b1
		//		  filter:  b3
		//		  forEach: b3
		//		  filter:  c
		//		  forEach: c
		
		System.out.println("=====================================================================");

		Stream.of("d2", "a2", "b1", "b3", "c")
		.map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		})
		.anyMatch(s -> {
			System.out.println("anyMatch: " + s);
			return s.startsWith("A");
		});

		// map:      d2
		// anyMatch: D2
		// map:      a2
		// anyMatch: A2
		
		System.out.println("=====================================================================");

		Stream.of("d2", "a2", "b1", "b3", "c")
		.map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		})
		.filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("A");
		})
		.forEach(s -> System.out.println("forEach: " + s));

		// map:     d2
		// filter:  D2
		// map:     a2
		// filter:  A2
		// forEach: A2
		// map:     b1
		// filter:  B1
		// map:     b3
		// filter:  B3
		// map:     c
		// filter:  C

		System.out.println("=====================================================================");

		Stream.of("d2", "a2", "b1", "b3", "c")
		.sorted((s1, s2) -> {
			System.out.printf("sort: %s; %s\n", s1, s2);
			return s1.compareTo(s2);
		})
		.filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("a");
		})
		.map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		})
		.forEach(s -> System.out.println("forEach: " + s));

		//		sort:    a2; d2
		//		sort:    b1; a2
		//		sort:    b1; d2
		//		sort:    b1; a2
		//		sort:    b3; b1
		//		sort:    b3; d2
		//		sort:    c; b3
		//		sort:    c; d2
		//		filter:  a2
		//		map:     a2
		//		forEach: A2
		//		filter:  b1
		//		filter:  b3
		//		filter:  c
		//		filter:  d2

		System.out.println("=====================================================================");

		Stream.of("d2", "a2", "b1", "b3", "c")
		.filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("a");
		})
		.sorted((s1, s2) -> {
			System.out.printf("sort: %s; %s\n", s1, s2);
			return s1.compareTo(s2);
		})
		.map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		})
		.forEach(s -> System.out.println("forEach: " + s));

		// filter:  d2
		// filter:  a2
		// filter:  b1
		// filter:  b3
		// filter:  c
		// map:     a2
		// forEach: A2
		
		System.out.println("=====================================================================");


		Stream<String> stream =
				Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> s.startsWith("a"));

		stream.anyMatch(s -> true);    // ok
//		stream.noneMatch(s -> true);   // java.lang.IllegalStateException: stream has already been operated upon or closed

		System.out.println("=====================================================================");
		
		Supplier<Stream<String>> streamSupplier =
				() -> Stream.of("d2", "a2", "b1", "b3", "c")
				.filter(s -> s.startsWith("a"));

				streamSupplier.get().anyMatch(s -> true);   // ok
				streamSupplier.get().noneMatch(s -> true);  // ok	

				List<Person> filtered =
						persons
						.stream()
						.filter(p -> p.name.startsWith("P"))
						.collect(Collectors.toList());

				System.out.println(filtered);    // [Peter, Pamela]
				
		System.out.println("=====================================================================");

				Map<Integer, List<Person>> personsByAge = persons
						.stream()
						.collect(Collectors.groupingBy(p -> p.age));

				personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

				// age 18: [Max]
				// age 23: [Peter, Pamela]
				// age 12: [David]
		System.out.println("=====================================================================");

				Double averageAge = persons.stream()
						.collect(Collectors.averagingInt(p -> p.age));

				System.out.println(averageAge);     // 19.0
		System.out.println("=====================================================================");

				IntSummaryStatistics ageSummary = persons.stream()
						.collect(Collectors.summarizingInt(p -> p.age));

				System.out.println(ageSummary);
				// IntSummaryStatistics{count=4, sum=76, min=12, average=19.000000, max=23}
		System.out.println("=====================================================================");

				String phrase = persons.stream()
						.filter(p -> p.age >= 18)
						.map(p -> p.name)
						.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

				System.out.println(phrase);
		System.out.println("=====================================================================");
				Map<Integer, String> map = persons.stream()
						.collect(Collectors.toMap(
								p -> p.age,
								p -> p.name,
								(name1, name2) -> name1 + ";" + name2));

				System.out.println(map);
				// {18=Max, 23=Peter;Pamela, 12=David}
		System.out.println("=====================================================================");

				Collector<Person, StringJoiner, String> personNameCollector =
						Collector.of(
								() -> new StringJoiner(" | "),          // supplier
								(j, p) -> j.add(p.name.toUpperCase()),  // accumulator
								(j1, j2) -> j1.merge(j2),               // combiner
								StringJoiner::toString);                // finisher

				String names = persons.stream()
						.collect(personNameCollector);

				System.out.println(names);  // MAX | PETER | PAMELA | DAVID
		System.out.println("=====================================================================");

				//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
				//FlatMap=======================================================================================

				List<Foo> foos = new ArrayList<>();

				// create foos
				IntStream.range(1, 4)
				.forEach(i -> foos.add(new Foo("Foo" + i)));

				// create bars
				foos.forEach(f ->IntStream
				.range(1, 4)
				.forEach(i -> f.bars.add(new Bar("Bar" + i + " <- " + f.name))));

				foos.stream()
				.flatMap(f -> f.bars.stream())
				.forEach(b -> System.out.println(b.name));

				// Bar1 <- Foo1
				// Bar2 <- Foo1
				// Bar3 <- Foo1
				// Bar1 <- Foo2
				// Bar2 <- Foo2
				// Bar3 <- Foo2
				// Bar1 <- Foo3
				// Bar2 <- Foo3
				// Bar3 <- Foo3
		System.out.println("=====================================================================");

				IntStream.range(1, 4)
				.mapToObj(i -> new Foo("Foo" + i))
				.peek(f -> IntStream.range(1, 4)
						.mapToObj(i -> new Bar("Bar" + i + " <- "+f.name))
						.forEach(f.bars::add))
				.flatMap(f -> f.bars.stream())
				.forEach(b -> System.out.println(b.name));
		System.out.println("=====================================================================");
				
				Outer outer = new Outer();
				if (outer != null && outer.nested != null && outer.nested.inner != null) {
					System.out.println(outer.nested.inner.foo);
				}

				Optional.of(new Outer())
				.flatMap(o -> Optional.ofNullable(o.nested))
				.flatMap(n -> Optional.ofNullable(n.inner))
				.flatMap(i -> Optional.ofNullable(i.foo))
				.ifPresent(System.out::println);
		System.out.println("=====================================================================");
				persons.stream()
				.reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
				.ifPresent(System.out::println);    // Pamela

		System.out.println("=====================================================================");
				Person result = persons.stream()
						.reduce(new Person("", 0), (p1, p2) -> {
							p1.age += p2.age;
							p1.name += p2.name;
							return p1;
						});

				System.out.format("name=%s; age=%s", result.name, result.age);
				// name=MaxPeterPamelaDavid; age=76
				
		System.out.println("=====================================================================");
				Integer ageSum = persons
						.stream()
						.reduce(0, (sum, p) -> sum += p.age, (sum1, sum2) -> sum1 + sum2);

				System.out.println(ageSum);  // 76
		System.out.println("=====================================================================");
				Integer ageSum1 = persons
						.stream()
						.reduce(0,
								(sum, p) -> {
									System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
									return sum += p.age;
								},
								(sum1, sum2) -> {
									System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
									return sum1 + sum2;
								});

				// accumulator: sum=0; person=Max
				// accumulator: sum=18; person=Peter
				// accumulator: sum=41; person=Pamela
				// accumulator: sum=64; person=David

		System.out.println("=====================================================================");

				Integer ageSum2 = persons
						.parallelStream()
						.reduce(0,
								(sum, p) -> {
									System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
									return sum += p.age;
								},
								(sum1, sum2) -> {
									System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
									return sum1 + sum2;
								});

				// accumulator: sum=0; person=Pamela
				// accumulator: sum=0; person=David
				// accumulator: sum=0; person=Max
				// accumulator: sum=0; person=Peter
				// combiner: sum1=18; sum2=23
				// combiner: sum1=23; sum2=12
				// combiner: sum1=41; sum2=35
		System.out.println("=====================================================================");
				ForkJoinPool commonPool = ForkJoinPool.commonPool();
				System.out.println(commonPool.getParallelism());    // 3

		System.out.println("=====================================================================");
				Arrays.asList("a1", "a2", "b1", "c2", "c1")
				.parallelStream()
				.filter(s -> {
					System.out.format("filter: %s [%s]\n",
							s, Thread.currentThread().getName());
					return true;
				})
				.map(s -> {
					System.out.format("map: %s [%s]\n",
							s, Thread.currentThread().getName());
					return s.toUpperCase();
				})
				.forEach(s -> System.out.format("forEach: %s [%s]\n",
						s, Thread.currentThread().getName()));

				//		filter:  b1 [main]
				//		filter:  a2 [ForkJoinPool.commonPool-worker-1]
				//		map:     a2 [ForkJoinPool.commonPool-worker-1]
				//		filter:  c2 [ForkJoinPool.commonPool-worker-3]
				//		map:     c2 [ForkJoinPool.commonPool-worker-3]
				//		filter:  c1 [ForkJoinPool.commonPool-worker-2]
				//		map:     c1 [ForkJoinPool.commonPool-worker-2]
				//		forEach: C2 [ForkJoinPool.commonPool-worker-3]
				//		forEach: A2 [ForkJoinPool.commonPool-worker-1]
				//		map:     b1 [main]
				//		forEach: B1 [main]
				//		filter:  a1 [ForkJoinPool.commonPool-worker-3]
				//		map:     a1 [ForkJoinPool.commonPool-worker-3]
				//		forEach: A1 [ForkJoinPool.commonPool-worker-3]
				//		forEach: C1 [ForkJoinPool.commonPool-worker-2]
		System.out.println("=====================================================================");

				Arrays.asList("a1", "a2", "b1", "c2", "c1")
				.parallelStream()
				.filter(s -> {
					System.out.format("filter: %s [%s]\n",
							s, Thread.currentThread().getName());
					return true;
				})
				.map(s -> {
					System.out.format("map: %s [%s]\n",
							s, Thread.currentThread().getName());
					return s.toUpperCase();
				})
				.sorted((s1, s2) -> {
					System.out.format("sort: %s <> %s [%s]\n",
							s1, s2, Thread.currentThread().getName());
					return s1.compareTo(s2);
				})
				.forEach(s -> System.out.format("forEach: %s [%s]\n",
						s, Thread.currentThread().getName()));

				//filter:  c2 [ForkJoinPool.commonPool-worker-3]
				//filter:  c1 [ForkJoinPool.commonPool-worker-2]
				//map:     c1 [ForkJoinPool.commonPool-worker-2]
				//filter:  a2 [ForkJoinPool.commonPool-worker-1]
				//map:     a2 [ForkJoinPool.commonPool-worker-1]
				//filter:  b1 [main]
				//map:     b1 [main]
				//filter:  a1 [ForkJoinPool.commonPool-worker-2]
				//map:     a1 [ForkJoinPool.commonPool-worker-2]
				//map:     c2 [ForkJoinPool.commonPool-worker-3]
				//sort:    A2 <> A1 [main]
				//sort:    B1 <> A2 [main]
				//sort:    C2 <> B1 [main]
				//sort:    C1 <> C2 [main]
				//sort:    C1 <> B1 [main]
				//sort:    C1 <> C2 [main]
				//forEach: A1 [ForkJoinPool.commonPool-worker-1]
				//forEach: C2 [ForkJoinPool.commonPool-worker-3]
				//forEach: B1 [main]
				//forEach: A2 [ForkJoinPool.commonPool-worker-2]
				//forEach: C1 [ForkJoinPool.commonPool-worker-1]
		System.out.println("=====================================================================");
		
				List<Person> persons1 = Arrays.asList(
						new Person("Max", 18),
						new Person("Peter", 23),
						new Person("Pamela", 23),
						new Person("David", 12));

				persons1.parallelStream()
				.reduce(0,
						(sum, p) -> {
							System.out.format("accumulator: sum=%s; person=%s [%s]\n",
									sum, p, Thread.currentThread().getName());
							return sum += p.age;
						},
						(sum1, sum2) -> {
							System.out.format("combiner: sum1=%s; sum2=%s [%s]\n",
									sum1, sum2, Thread.currentThread().getName());
							return sum1 + sum2;
						});

				//accumulator: sum=0; person=Pamela; [main]
				//accumulator: sum=0; person=Max;    [ForkJoinPool.commonPool-worker-3]
				//accumulator: sum=0; person=David;  [ForkJoinPool.commonPool-worker-2]
				//accumulator: sum=0; person=Peter;  [ForkJoinPool.commonPool-worker-1]
				//combiner:    sum1=18; sum2=23;     [ForkJoinPool.commonPool-worker-1]
				//combiner:    sum1=23; sum2=12;     [ForkJoinPool.commonPool-worker-2]
				//combiner:    sum1=41; sum2=35;     [ForkJoinPool.commonPool-worker-2]
		System.out.println("=====================================================================");
	}

}
