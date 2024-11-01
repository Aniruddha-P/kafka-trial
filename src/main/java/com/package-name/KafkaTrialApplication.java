package com.kafka.trial.kafkatrial;

import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.quota.ClientQuotaAlteration;
import org.springframework.beans.factory.support.InstantiationStrategy;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

import javax.swing.*;
import java.lang.module.FindException;
import java.net.BindException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class KafkaTrialApplication {

	public static void main(String[] args) {

		//SpringApplication.run(KafkaTrialApplication.class, args);

		System.out.println("This works!");
		//int solution = solution(new int[]{3, 2, 6, 4, 1});
		//int solution = solutionDigram("abnfabhebckckbckjrjnjbcnjsk");
		//int solution = solutionDigramOneLiner("abcdabefghij");
		/*
		int solution = solutionTable(new int[]
						*//*{11, 20, 15}*//*
						{15, 20, 9, 11}
				*//*{9}*//*
				*//*{0, 44, 32, 30, 42, 18, 34, 16, 35}*//*
				*//*{36, 7, 28, 1, 20, 39, 16, 30, 96, 14, 87}*//*
		);
		*/
		/*
		int solution = solutionTableOneLiner(new int[]
						//{11, 20, 15});
						//{15, 20, 9, 11});
						//{0, 44, 32, 30, 42, 18, 34, 16, 35});
						//{36, 7, 28, 1, 20, 39, 16, 30, 47, 96, 14, 87});
						{9});
*/
		//int solution = solution(new int[] {1,2, 4, 5, 7});

		//int solution = solution("abcdab");
		//System.out.println("Solution " +solution);

		//test(new String[] {"aabb", "aaaa", "bbab"});
		//test(new String[] {"xxbxx", "xbx", "x"});
		//test(new String[] {"dd", "bb", "cc", "dd"});
		//getMaxSameLeadingCharsString("axaaaa");
		//removeLongestSubstringWithSameCharAtStartAndEnd("abcdabc", "c");
		//int solution = getSubString("abccac");
		//int solution = getSubString("abcdabcdabcd");
		//int solution = getSubString("axaabyab");
		//int solution = getSubString("cbcccbcajsbhy");

		//int solution = newSolution("abdaaf");
		//int solution = newSolution("dog");
		//int solution = newSolution("kfkaaa");
		//int solution = newSolution("aa");
		//int solution = newSolution("ababaac");

		//int solution = solutionBalanced("cabbacc");
		//int solution = solutionBalanced("abababa");
		//int solution = solutionBalanced("aaaaaaa");

		//int solution = solutionTreeTrip(2, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});
		//int optimisedSolution = solutionTreeOptimised(2, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});

		//int solution = solutionTreeTrip(3, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});
		//int optimisedSolution = solutionTreeOptimised(3, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});

		//int solution = solutionTreeTrip(4, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});
		//int optimisedSolution = solutionTreeOptimised(4, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});

		//int solution = solutionTreeTrip(5, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});
		//int optimisedSolution = solutionTreeOptimised(5, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});

		//int solution = solutionTreeTrip(6, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});
		//int optimisedSolution = solutionTreeOptimised(6, new int[]{1,3,0,3,2,4,4} , new int[] {6,2,7,5,6,5,2});

		//System.out.println("Solution " + solution);
		//System.out.println("Solution " + solution + " OptimisedSolution " + optimisedSolution);

		//int solution = solutionMultivitaminWorkignForAll(new int[]{10, 2, 1, 1}, new int[]{10, 3, 2, 2});
		//int solution = solutionMultivitaminWorkignForAll(new int[]{1, 2, 3, 4}, new int[]{3, 6, 4, 4});
		//int solution = solutionMultivitaminWorkignForAll(new int[]{2, 3}, new int[]{3, 4});
		//int solution = solutionMultivitaminWorkignForAll(new int[]{1, 1, 5}, new int[]{6, 5, 8});
		//System.out.println("Solution " + solution);
/*
		// test case
		TreeNode root = new TreeNode(5);
		// left side
		root.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.left.right.left = new TreeNode(6);
		root.left.right.left.right = new TreeNode(7);
		// right side
		root.right = new TreeNode(8);
		root.right.right = new TreeNode(9);
		root.right.right.left = new TreeNode(2);

		//System.out.println("\n" + rightSideView(root));
		rightSideViewNew(root);
		*/

		//solutionDay("Wed", 2);
		//solutionDay("Sat", 23);

		//int[] a = {1,2,3};
		//solutionMaXslice(a);

		//solutionAlternatingSlice(new int[] {-1,2,-3,0,-4,-5,-6,7,-8,9,-10,11,-12,13});
		//solutionAlternatingSlice(new int[] {4, 5, 1, 0, -9, 3, -6, 0, -7, -8});
		//solutionAlternatingSlice(new int[] {1, -2, 3});
		//solutionAlternatingSlice(new int[] {1, 2, 3});
		//solutionAlternatingSlice(new int[] {-4, 5, -1, 0, -1, 3, -6, 0, -7, -8});
		//hackerRank1();
		//List<Integer> A = List.of(1,4,2,1,3);
		//List<Integer> B = List.of(2,3,1,2,2);
		//List<Integer> A = List.of(1,9,4,2);
		//List<Integer> B = List.of(8,4,3,1);
		//hackerRank2(A, B);
		//
		int s = s("kfsd;lkfsd;ll;dsl;");
		System.out.println("Solution " + s);

	}

	public static int solutionEpam(String s) {
		Map<String, Long> charAndCount = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println("charAndCount" + charAndCount);
		int count = 0;

		List<Map.Entry<String, Long>> charAndOddCount = charAndCount.entrySet().stream()
				.filter(c -> charAndCount.get(c)%2!=0)
				.collect(Collectors.toList());

		System.out.println("charAndOddCount" + charAndOddCount);

		return 0;

	}

	public static int s(String s) {
		if(s==null || s.isEmpty() || s.isBlank()) {
			return 0;
		}

		Map<String, Long> charAndCount = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println("charAndCount " + charAndCount);

		/*Long countOfOdd = charAndCount.entrySet().stream()
				.filter(c -> charAndCount.get(c)%2!=0)
				.map(e->e.getKey())
				.count();

		System.out.println("countOdd" + countOfOdd);
		return countOfOdd.intValue();*/

		List<String> list = charAndCount.entrySet().stream().filter(a-> a.getValue()%2!=0)
				.map(a->a.getKey())
				.collect(Collectors.toList());

		System.out.println("list " + list);

		return list.size();

	}









	public static void hackerRank2(List<Integer> A, List<Integer> B) {
		List<Integer> solution = new ArrayList<Integer>();
		List<Integer> sortedB = B.stream().sorted().collect(Collectors.toList());
		int alength = A.size();

		Map<Integer, Long> bMap = B.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		System.out.println("bMap" + bMap);

		A.stream().forEach(aValue -> {
				Optional<Integer> bValueGreaterThanA = sortedB.stream()
						.filter(bValue -> bValue>aValue && bMap.get(bValue)!=0).findFirst();
				if(bValueGreaterThanA.isPresent()) {
					System.out.println("aValue " +  aValue + " bValue " + bValueGreaterThanA.get());
					solution.add(bValueGreaterThanA.get());
					if(bMap.get(bValueGreaterThanA.get())!=null) bMap.put(bValueGreaterThanA.get(), bMap.get(bValueGreaterThanA.get()) - 1);
				}
			});
		System.out.println("solution " + solution);
		int sum = solution.stream().mapToInt(value -> value.intValue()).sum();
		System.out.println("Sum is " + sum);

		new StringBuilder("").reverse().toString();
	}




	public static void hackerRank1() {
		int solution = Integer.parseInt("50") / 5;
	}




	static public int solutionAlternatingSliceNew(int[] a) {
		//Arrays.sort(a);
		Map<Integer, Integer> indexAndLength = new HashMap<>();
		int maxlength = 0;
		int alternatingSliceLength = 1;
		boolean breakLoop = false;
		for(int i=0; i<a.length; i++){
			breakLoop = false;
			if((a[i] > 0) || ((a[i]==0 && a[i+1] <= 0))){
				//positive number
				System.out.println("Positive for " + i);
				for(int j=i; j<a.length; j+=2) {
					System.out.println("j " + j);
					if(j<a.length-1) {
						if((a[j] >=0 && a[j+1] <=0)) {
							alternatingSliceLength = j;
							indexAndLength.put(i, j+1-i+1); //j+1 or j-1
							System.out.println("indexAndLength " + indexAndLength);
							//break;
						} else {
							if(a[j] >=0)
								indexAndLength.put(i, j-i+1); //j+1 or j-1
							System.out.println("indexAndLength " + indexAndLength);
							breakLoop = true;
						}
					}
					if (breakLoop)
						break;
				}
			} else  if((a[i] < 0) || ((a[i]==0 && a[i+1] >= 0))){
				//negative
				System.out.println("Negative for " + i);
				for(int j=i; j<a.length; j+=2) {
					if(j<a.length-1) {
						if((a[j] <=0 && a[j+1] >=0)) {
							alternatingSliceLength = j;
							indexAndLength.put(i, j+1-i+1); //j+1 or j-1
							System.out.println("indexAndLength " + indexAndLength);
						} else {
							if(a[j] <=0)
								indexAndLength.put(i, j-i+1); //j+1 or j-1
							System.out.println("indexAndLength " + indexAndLength);
							breakLoop = true;
						}
					}
					if (breakLoop)
						break;
				}

			}
		}

		System.out.println("indexAndLength" + indexAndLength);

		int length = indexAndLength.values().stream().max(Comparator.comparing(Integer::intValue)).orElse(1);

		System.out.println("Alternating length " + length);

		return length;
	}



	public static void solutionAlternatingSlice(int[] A) {
		int maxAlternatingSliceLength = 0;
		int localMaxAlternatingSliceLength = 0;
		for(int i=0; i<A.length /*&& (A.length-1-i>maxAlternatingSliceLength)*/; i++) {
				localMaxAlternatingSliceLength=0;
				if(A[i]>=0){
					System.out.println("Positive for " + i + " with value " + A[i]);
				} else {
					System.out.println("Negative for " + i + " with value " + A[i]);
				}
				for(int j=i; j<A.length; j+=2) {
					int alternatingCount =
							A[i]>=0 ?
							getAlternatingCountForPositiveValueIndex(A, j)
							: getAlternatingCountForNegativeValueIndex(A, j);
					System.out.println("Alternating count for " + j + " - " + alternatingCount);
					if(alternatingCount<2) {
						if(alternatingCount==1) {
							localMaxAlternatingSliceLength += alternatingCount;
						}
						break;
					} else {
						localMaxAlternatingSliceLength += alternatingCount;
						System.out.println("localMaxAlternatingSliceLength " + localMaxAlternatingSliceLength);
					}
				}
				maxAlternatingSliceLength = localMaxAlternatingSliceLength>maxAlternatingSliceLength ? localMaxAlternatingSliceLength : maxAlternatingSliceLength;
				System.out.println("maxAlternatingSliceLength for " + i + " "  + maxAlternatingSliceLength);
		}
	}
	//4, 5, -1, 0, 9, -3, 6, 0, 7, 8
	private static int getAlternatingCountForPositiveValueIndex(int[] A, int index) {
		System.out.println("Postive called for " + index + " with value " + A[index]);
		if(A[index]>=0) {
			if((index+1<=A.length-1) && A[index+1]<=0) {
				return 2;
			}
			return 1;
		}
		return 0;
	}

	private static int getAlternatingCountForNegativeValueIndex(int[] A, int index) {
		System.out.println("Negative called for " + index + " with value " + A[index]);
		if(A[index]<=0) {
			if((index+1<=A.length-1) && A[index+1]>=0) {
				return 2;
			}
			return 1;
		}
		return 0;
	}

	public static String[] days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	public static String solutionDay(String s, int k) {
		int dayIndex = 0;
		for(int i=0; i<days.length; i++) {
			if(s.equals(days[i])) {
				dayIndex=i;
				break;
			}
		}
		int newIndex = (dayIndex + (k%days.length))% days.length;
		return days[newIndex];
	}



		//System.out.println(solutionMaXslice[a]);
	public static void solutionMaXslice(int[] A) {
		int absoluteMax = A[0];
		int localMax = A[0];
		int nextSum = 0;
		int currentElement = 0;

		for (int i = 1; i < A.length; i++) {
			currentElement = A[i];
			nextSum = localMax + currentElement;
			localMax = Math.max(A[i], nextSum);
			absoluteMax = Math.max(absoluteMax, localMax);
		}
		System.out.println("Absolute : " + absoluteMax);
		//return absoluteMax;
	}









	public static List<Integer> rightSideView(TreeNode root) {
		// your code here
		return findRightForRoot(root);
	}

	public static List<Integer> findRightForRoot(TreeNode rootNode) {
		List<Integer> rightSideView = new LinkedList<>();
		TreeNode node = findRight(rootNode, rootNode.left, rootNode.right);
		while(node!=null) {
			rightSideView.add(node.val);
			node = findRight(node.right, node.right.left, node.right.right);
			/*
			if(node.val == rootNode.right.val) {
				//node = findRight(rootNode.right, rootNode.right.left, rootNode.right.right);
				node = findRight(node.right, node.right.left, node.right.right);
			} else if(node.val == rootNode.left.val) {
				//node = findRight(rootNode.left, rootNode.left.left, rootNode.left.right);
				node = findRight(node.left, node.left.left, node.left.right);
			}
			*/
		}
		return rightSideView;
	}
	public static TreeNode findRight(TreeNode rootNode, TreeNode leftNode, TreeNode rightNode) {
		System.out.print("\nFinding right view for root node " + rootNode.val);
		if(rightNode!=null) {
			System.out.print("\nReturning " + rightNode.val);
			return rightNode;
		} else if(leftNode!=null) {
			System.out.print("\nReturning " + leftNode.val);
			return leftNode;
		}
		System.out.print("\nReturning null");
		return null;
		/*
		if(rightNode!=null) {
			if(rightNode.right!=null) {
				return rightNode;
			} else if(rightNode.left!=null) {
				return rightNode;
			}
		} else if(leftNode!=null) {
			if(leftNode.right!=null) {
				return leftNode;
			} else if(leftNode.left!=null) {
				return leftNode;
			}
		}
		return null;
		*/

	}
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

		@Override
		public String toString() {
			return val+"";
		}
	}











	public static int solutionMultivitaminWorkignForAll(int[] juice, int[] capacity) {

		Map<Integer, Integer> glassesAndRemainingCapacities = IntStream.range(0, capacity.length).boxed()
				.collect(Collectors.toMap(glassIndex -> glassIndex, glassIndex -> capacity[glassIndex]-juice[glassIndex], (o1, o2) -> o1, LinkedHashMap::new));

		glassesAndRemainingCapacities = glassesAndRemainingCapacities.entrySet().stream()
						.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), (o1, o2) -> o1, LinkedHashMap::new));

		System.out.println("glassesAndRemainingCapacities in Descending order" + glassesAndRemainingCapacities);

		Optional<Integer> maxJuices = glassesAndRemainingCapacities.entrySet().stream()
				.map(entry -> solutionMultivitaminForGivenCapacity(juice, entry.getValue(), entry.getKey()))
				.max(Comparator.comparing(Integer::intValue));

		System.out.println("maxJuices " + maxJuices.orElse(0));
		return maxJuices.orElse(1);
	}

	private static int solutionMultivitaminForGivenCapacity(int[] juice, int remainingCapacity, int glassIndex) {
		System.out.println("\nAdding juices in glassIndex " + glassIndex + " with remainingCapacity  " + remainingCapacity);
		AtomicInteger filledCapacity = new AtomicInteger(0);
		List<Integer> otherGlassesAdded = IntStream.range(0, juice.length)
				//Filter glass already selected to be filled ie glassIndex
				.filter(index -> index!=glassIndex)
				//Filter remaining glasses with juice more than maxRemainingCapacity
				.filter(index -> juice[index]<=remainingCapacity)
				.takeWhile(index -> {
					System.out.print("\nGlassIndex " + index + " Juice " + juice[index]);
					System.out.print("\nBefore filledCapacity " + filledCapacity.get());
					int afterFilledCapacity = filledCapacity.addAndGet(juice[index]);
					System.out.print("\nAfter filledCapacity " + afterFilledCapacity);
					return remainingCapacity >= afterFilledCapacity;
				})
				.boxed()
				.collect(Collectors.toList());
		System.out.println("\notherGlassesAdded " + otherGlassesAdded);
		int otherGlassesAddedListSize = otherGlassesAdded.size();
		System.out.println("\nTotal glasses " + (otherGlassesAdded.size()+1));
		return 1 + otherGlassesAddedListSize;
	}

	public static int solutionMultivitamin(int[] juice, int[] capacity) {
		/*
		*
1. Given juice = [10, 2, 1, 1] and capacity = [10, 3, 2, 2], your function should return 2. Rick can pour juice from the 3rd glass into the 2nd one.

2. Given juice = [1, 2, 3, 4] and capacity = [3, 6, 4, 4], your function should return 3. Rick can pour juice from the 0th and 2nd glasses into the 1st one.

3. Given juice = [2, 3] and capacity = [3, 4], your function should return 1. No matter which glass he chooses, Rick cannot pour juice from the other one into it. The maximum number of flavours in the chosen glass is 1.

* This logic fails for 4th data set
* Hence better to dp 'how many other glasses can be poured' for each remaining capacity
* Done in solutionMultivitaminWorkignForAll()
4. Given juice = [1, 1, 5] and capacity = [6, 5, 8], your function should return 3. Rick can mix all juices in the 2nd glass.
		* */

		//Capacity-Juice - Highest - Can add most jiuce in this glass - Many flavours
		//Get from remaining glasses - Glasses with least Jiuce - For Many flavours

				/*
				Map<Integer, List<Integer>> glassesAndRemainingCapacities =
				IntStream.range(0, capacity.length).boxed()
				.collect(Collectors.groupingBy(glassIndex -> glassIndex, Collectors.mapping(glassIndex -> {
					int i = (int)glassIndex;
					return capacity[i]-juice[i];
				}, Collectors.toList())));
				*/
		Map<Integer, Integer> glassesAnJuices = IntStream.range(0, capacity.length).boxed()
				.collect(Collectors.toMap(glassIndex -> glassIndex, glassIndex -> juice[glassIndex], (o1, o2) -> o1, LinkedHashMap::new));

		Map<Integer, Integer> glassesAndRemainingCapacities = IntStream.range(0, capacity.length).boxed()
				.collect(Collectors.toMap(glassIndex -> glassIndex, glassIndex -> capacity[glassIndex]-juice[glassIndex], (o1, o2) -> o1, LinkedHashMap::new));

		System.out.println("glassesAndRemainingCapacities " + glassesAndRemainingCapacities);



		Optional<Map.Entry<Integer,Integer>> glassWithMaxRemainingCapacity = glassesAndRemainingCapacities.entrySet().stream()
				.collect(Collectors.maxBy((o1, o2) -> o1.getValue().compareTo(o2.getValue())));

		if(glassWithMaxRemainingCapacity.isPresent()) {
			System.out.println("glassWithMaxRemainingCapacuty " + glassWithMaxRemainingCapacity.get());
			int remainingCapacity = glassWithMaxRemainingCapacity.get().getValue();
			int selectedGlassIndex = glassWithMaxRemainingCapacity.get().getKey();
			AtomicInteger filledCapacity = new AtomicInteger(0);

			System.out.print("glassesAnJuices " + glassesAnJuices);

			List<Map.Entry<Integer,Integer>> otherGlassesAdded = glassesAnJuices.entrySet().stream()
					//Filter glass already selected to be filled ie. glassWithMaxRemainingCapacuty
					.filter(entry -> entry.getKey() != selectedGlassIndex)
					//Filter remaining glasses with juice more than maxRemainingCapacity
					.filter(entry -> entry.getValue()<=remainingCapacity)
					.takeWhile(entry -> {
						System.out.print("\nGlassIndex " + entry.getKey() + " Jiuce " + entry.getValue());
						System.out.print("\nBefore filledCapacity " + filledCapacity.get());
						int afterFilledCapacity = filledCapacity.addAndGet(entry.getValue());
						System.out.print("\nAfter filledCapacity " + afterFilledCapacity);
						return remainingCapacity >= afterFilledCapacity;
					})
					.collect(Collectors.toList());

			System.out.println("\notherGlassesAdded " + otherGlassesAdded);

			int otherGlassesAddedListSize = otherGlassesAdded.size();

			return 1 + otherGlassesAddedListSize;

		}
		return 1;
	}




	public static int solutionTreeOptimised(int K, int[] C, int[] D) {
		HashMap<Integer, List<Integer>> topKAttractivenessScoresAndCities = Arrays.stream(D).boxed().sorted(Comparator.comparing(Integer::intValue).reversed())
				.collect(Collectors.toMap(attractiveness -> attractiveness, attractiveness -> {
					List<Integer> listOfCities = IntStream.range(0, D.length).boxed()
							.filter(index -> D[index] == attractiveness)
							.collect(Collectors.toList());
					return listOfCities;
				}, (integer, integer2) -> integer, LinkedHashMap::new));
		System.out.println("topKAttractivenessScoresAndCities " +  topKAttractivenessScoresAndCities);

		List<Integer> excludedCities = new LinkedList<>();

		List<Integer> cities = topKAttractivenessScoresAndCities.values().stream()
				.flatMap(List::stream)
				.filter(cityIndex -> {
					if(C[cityIndex]!=cityIndex) {
						return true;
					} else {
						excludedCities.add(cityIndex);
						return false;
					}
				})
				.takeWhile(cityIndex -> {
					Optional<Integer> maxAttractivenessScoreExcluded = excludedCities.stream().map(index -> D[index])
							.max(Comparator.comparing(Integer::intValue));
					if(maxAttractivenessScoreExcluded.isPresent()) {
						return D[cityIndex] >= maxAttractivenessScoreExcluded.get();
					}
					return true;
				})
				.limit(K)
				.collect(Collectors.toList());
		System.out.println("cities " +  cities);
		return cities.size() > K ? K :  cities.size();

	}

	public static int solutionTreeTrip(int K, int[] C, int[] D) {

		List<Integer> DList = Arrays.stream(D).boxed().collect(Collectors.toCollection(LinkedList::new));

		//Top most K (less than K if duplicates) attractiveness scores from D
		List<Integer> mostAttractiveScores = Arrays.stream(D).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).limit(K).distinct().collect(Collectors.toCollection(LinkedList::new));
		System.out.println("mostAttractiveScores " + mostAttractiveScores);

		//Get (K or more, as some cities may have same attractiveness score) city indexes from D for this top most K attractiveness scores
		List<Integer> cityIndexesBasedOnMostAttractiveScores =  mostAttractiveScores.stream().flatMapToInt(score -> {
			System.out.println("score " + score + " DList.indexOf(score) " + DList.indexOf(score) + " DList.lastIndexOf(score) " + DList.lastIndexOf(score));
			return IntStream.rangeClosed(DList.indexOf(score), DList.lastIndexOf(score))
					.filter(index -> DList.get(index) == score);
		}).boxed().collect(Collectors.toCollection(LinkedList::new));
		System.out.println("cityIndexesBasedOnMostAttractiveScores " + cityIndexesBasedOnMostAttractiveScores);

		//Get possbile (K or more) cities from C for trip (based on Connection condition) using city indexes obtained from D
		List<Integer> possibleTripCities = cityIndexesBasedOnMostAttractiveScores.stream().filter(cityIndex -> {
					System.out.println("cityIndex " + cityIndex + " C[cityIndex] " + C[cityIndex] + " cityIndex && mostAttractiveCities.contains(C[cityIndex]) " + ((C[cityIndex] != cityIndex) /*&& cityIndexesBasedOnMostAttractiveScores.contains(C[cityIndex])*/));
					boolean returnValue = (C[cityIndex] != cityIndex); //&& cityIndexesBasedOnMostAttractiveScores.contains(C[cityIndex]);
					System.out.println("returning " + returnValue + " for cityIndex " + cityIndex);
							return returnValue;
				})
				.collect(Collectors.toList());
		System.out.println("possibleTripCities " + possibleTripCities);

		//Get excluded city with max attractiveness score
		Optional<Integer> excludedCityWithMaxAttractiveness = IntStream.range(0, C.length)
				.filter(index -> !possibleTripCities.contains(index))
				.boxed()
				.collect(Collectors.maxBy((o1, o2) -> DList.get(o2) > DList.get(o1) ? o2 : o1));

		List<Integer> tripCities;

		//If any excluded city with max attractiveness score found
		//get (from possible cities for trip) all such cities with attractiveness score greater than or equals to excluded city with max attractiveness score
		if(excludedCityWithMaxAttractiveness.isPresent()) {
			Integer excludedMaxAttractiveness = DList.get(excludedCityWithMaxAttractiveness.get());
			System.out.println("excludedCityWithMaxAttractiveness " + excludedCityWithMaxAttractiveness.get() + " excludedMaxAttractiveness" + excludedMaxAttractiveness);
			tripCities = possibleTripCities.stream().filter(index -> DList.get(index) >= excludedMaxAttractiveness).collect(Collectors.toList());
		} else {
		//If no excluded city with max attractiveness score found
		//possible cities for trip for final cities for trip
			tripCities = possibleTripCities;
		}

		System.out.println("tripCities " + tripCities);

		//Get at most K cities
		return tripCities.size() > K ? K :  tripCities.size();
	}

















	public static int solutionBalanced(String s) {
		Map<String, Long> charsAndCounts = getCharsAndCounts(s);
		System.out.println("charAndCounts " + charsAndCounts);
		Map<String, Long> twoCharsWithTopCounts = getTwoCharsWithTopCounts(charsAndCounts);
		System.out.println("twoCharsWithTopCounts " + twoCharsWithTopCounts);
		Optional<Long> count = twoCharsWithTopCounts.entrySet().size() > 1 ? twoCharsWithTopCounts.values().stream().min(Comparator.comparing(Long::valueOf)) : Optional.of(0L);
		System.out.println("count " + count.orElse(0L));
		Long balancedCount = count.orElse(0L) * 2;
		System.out.println("balancedCount " + balancedCount);

		String balancedString = getBalancedString(s, balancedCount);
		System.out.println("Balaced String and size " + balancedString + " " + balancedString.length());
		return balancedString.length();
	}

	private static String getBalancedString(String s, Long balancedCount) {
		Optional<String> balancedStringOptional = Arrays.stream(s.split("")).map(s1 -> {
			int index = s.indexOf(s1);
			String temp = s.substring(index + 1, index + balancedCount.intValue() + 1);
			System.out.println("Substring " + temp);
			return temp;
		}).filter(string -> {
			int distinctChars = Arrays.stream(string.split("")).distinct().collect(Collectors.toList()).size();
			return distinctChars == 2;
		}).limit(1).findFirst();

		return balancedStringOptional.orElse("");
	}

	private static Map<String, Long> getTwoCharsWithTopCounts(Map<String, Long> charsAndCounts) {
		//return charsAndCounts.entrySet().stream().sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry::getValue))).limit(2)
		return charsAndCounts.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(2)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(),(o1, o2) -> o1, LinkedHashMap::new));
	}

	private static Map<String, Long> getCharsAndCounts(String s) {
		return Arrays.stream(s.split("")).collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
	}


	private static int newSolution(String s) {

		if(s.contains("aaa"))
			return -1;

		String[] sarr = s.split("");
		int totalCount = 0;

		for(int i=1; i<sarr.length; i++){
			totalCount = totalCount + getACountToBeAdded(sarr, i);
		}

		System.out.println("Total Count before Start and End " + totalCount);

		if("a".equals(sarr[0])) {
			/*if(!"a".equals(sarr[1]))
				totalCount = totalCount + 1;*/
			//If 0 has a, adding a is already settled when doing index 1
		} else {
			totalCount = totalCount + 2;
		}
		System.out.println("Total Count after Start " + totalCount);

		if("a".equals(sarr[sarr.length-1])) {
			if(!"a".equals(sarr[sarr.length-2]))
				totalCount = totalCount + 1;
		} else {
			totalCount = totalCount + 2;
		}
		System.out.println("Total Count after Start and End " + totalCount);

		return totalCount;
	}
	private static int getACountToBeAdded(String[] sarr, int index) {

		int returnValue = 0;
		if(!"a".equals(sarr[index])) {
			if(!"a".equals(sarr[index-1])) {
					returnValue = 2;
			} else if("a".equals(sarr[index-1])) {
				if(index>=2 && !"a".equals(sarr[index-2])) {
					returnValue = 1;
				} else if(index<2) {
					returnValue = 1;
				}
			}
		}

		/*
		If index has a, adding a is already settled when doing index for other non a
		else if ("a".equals(sarr[index])) {
			if(!"a".equals(sarr[index-1]) && !"a".equals(sarr[index+1])) {
					returnValue = 1;
			}
		}*/
		System.out.println("Index " + index + " Char " + sarr[index] + " Reutrn value " + returnValue);
		return returnValue;
	}
	public static int solution(String S) {;
		OptionalInt furthestIdenticalDigramDistance =  IntStream.range(0, S.length()-1)
				.filter(i -> {
					System.out.println("Digram " + (S.charAt(i)+""+S.charAt(i+1)));
					return S.lastIndexOf((S.charAt(i)+""+S.charAt(i+1))) - S.indexOf((S.charAt(i)+""+S.charAt(i+1))) > 0;
				})
				.max();
		return furthestIdenticalDigramDistance.orElse(-1);
	}
	public static int solution(int[] A) {
		List<Integer> intergers = IntStream.of(A).filter(num -> num > 0).sorted().distinct().boxed().collect(Collectors.toList());
		Optional<Integer> num = intergers.stream().filter(n -> {
			System.out.println(n);
			boolean b = !(intergers.contains(++n));
			System.out.println(b);
			return b;
		}).findFirst();
		return num.isPresent() ? num.get()+1  : 1;
	}

	public static int solutionDigram(String s) {
		int length = s.length();
		AtomicInteger distance = new AtomicInteger();
		IntStream.range(1,length-1).forEach(index -> {
			String digram = s.substring(index, index+2);
			int start = s.indexOf(digram);
			int end = s.lastIndexOf(digram);
			if((end - start) != 0 && (start != -1)) {
				int tempDistance = end - start;
				System.out.println("Digram " + digram);
				System.out.println("Start " + start);
				System.out.println("End " + end);
				if(tempDistance > distance.get()) {
					distance.set(tempDistance);
				}
			}
		});
		return distance.get() > 0 ? distance.get() :  -1;

		/*
		List<String> sortedDigram = IntStream.range(1,s.length()-1).boxed()
				.collect(Collectors.groupingBy(i -> s.substring(i, i+2), Collectors.counting()))
				.entrySet().stream()
				.filter(stringLongEntry -> stringLongEntry.getValue()>1)
				.map(stringLongEntry -> stringLongEntry.getKey())
				.sorted()
				.collect(Collectors.toList());

		System.out.println(sortedDigram);

				Optional<Map.Entry<String, Long>> distantDigram =
				sortedDigram.stream()
				.collect(Collectors.toMap(s1 -> s1, s1 -> (long) (sortedDigram.lastIndexOf(s1)-sortedDigram.indexOf(s1))))
				.entrySet()
				.stream()
				.max(Comparator.comparing(stringLongEntry -> stringLongEntry.getValue()));

		return distantDigram.isPresent() ? distantDigram.get().getValue().intValue() : 0;
		*/
	}
	public static int solutionTable(int[] A) {
		if(A.length==1) {
			return 1;
		}
		List<Integer> sortedHoles = IntStream.of(A).sorted().boxed().collect(Collectors.toList());
		System.out.println("Sorted Holes " + sortedHoles);
		Optional<Integer> shortestBoardLengthIndex = IntStream.range(1, A.length-1).filter(i -> {
			int firstBoardLength = sortedHoles.get(i) - sortedHoles.get(0);
			int secondBoardLength = sortedHoles.get(A.length-1) - sortedHoles.get(i + 1);
			System.out.println("i " + i + " Hole " + sortedHoles.get(i) +  " First " + firstBoardLength + " Second " +secondBoardLength);
			return (firstBoardLength > secondBoardLength);
		}).boxed().peek(System.out::println).findFirst();
		return shortestBoardLengthIndex.isPresent() ? getShortestBoardLenght(sortedHoles, shortestBoardLengthIndex) : 1;
	}
	private static int getShortestBoardLenght(List<Integer> sortedHoles, Optional<Integer> shortestBoardLengthIndex) {
		int fromStart = sortedHoles.get(shortestBoardLengthIndex.get()) - sortedHoles.get(0);
		int fromEnd = sortedHoles.get(sortedHoles.size()-1) - sortedHoles.get(shortestBoardLengthIndex.get());
		return fromStart > fromEnd ? fromEnd : fromStart;
	}

	public static List<String> groupNCharactersInString(String s) {
		List<String> splitStrings = Arrays.stream(s.substring(1).split("(?<=\\G.{2})")).collect(Collectors.toList());
		return splitStrings;
	}

	/*------------------------------------------------------------------------------------------------------------
	* ONE LINERS - DIGRAM
	* ------------------------------------------------------------------------------------------------------------
	* */

	public static int solutionDigramOneLiner(String s) {
		String[] arr = s.split("");
		OptionalInt maxDigramDistance = IntStream.range(0, arr.length-1)
				.map(getDigramDistanceInString(s, arr))
				.filter(i -> i>0)
				.max();
		return maxDigramDistance.orElse(-1);
	}
	private static IntUnaryOperator getDigramDistanceInString(String s, String[] arr) {
		return i -> s.lastIndexOf(arr[i] + arr[i + 1]) - s.indexOf(arr[i] + arr[i + 1]);
	}

	/*------------------------------------------------------------------------------------------------------------
	 * ONE LINERS - TABLE
	 * ------------------------------------------------------------------------------------------------------------
	 * */


	public static int solutionTableOneLiner(int[] A) {
		if(A.length==1) {
			return 1;
		}
		List<Integer> sortedHoles = IntStream.of(A).sorted().boxed().collect(Collectors.toList());
		OptionalInt shortestBoardLength = IntStream.range(1, A.length-1).filter(getFirstBoardLengthJustGreaterThanSecondBoardLength(A, sortedHoles))
				.map(determineShortestBoardLength(sortedHoles))
				.findFirst();
		return shortestBoardLength.orElse(1);
	}
	private static IntPredicate getFirstBoardLengthJustGreaterThanSecondBoardLength(int[] A, List<Integer> sortedHoles) {
		return i -> {
			int firstBoardLength = sortedHoles.get(i) - sortedHoles.get(0);
			int secondBoardLength = sortedHoles.get(A.length - 1) - sortedHoles.get(i + 1);
			return firstBoardLength > secondBoardLength;
		};
	}
	private static IntUnaryOperator determineShortestBoardLength(List<Integer> sortedHoles) {
		return i -> {
			int fromStart = sortedHoles.get(i) - sortedHoles.get(0);
			int fromEnd = sortedHoles.get(sortedHoles.size() - 1) - sortedHoles.get(i);
			return fromStart > fromEnd ? fromEnd : fromStart;
		};
	}

	public static void test(String[] words) {
		factorial();

		//System.out.println("aaaba".matches("^(.)\\1*$"));


		Map<String, Long>  charCount = Arrays.stream(words)
				.flatMap(s -> Arrays.stream(s.split("")))
				.collect(Collectors.groupingBy(String::toString, Collectors.counting()));

		System.out.println("charCount " + charCount);

		Optional<Map.Entry<String, Long>> mostAppearedEntry = charCount.entrySet().stream().max(Comparator.comparing(stringLongEntry -> stringLongEntry.getValue()));

		String mostApprearedString = mostAppearedEntry.get().getKey();

		System.out.println("mostApprearedString " + mostApprearedString);

		//Find indexes with all same chars and concat
		List<String> allSameCharsStrings = Arrays.stream(words).filter(s -> mostApprearedString.equals(String.valueOf(s.charAt(0))) &&  s.matches("^(.)\\1*$"))
				.collect(Collectors.toList());

		String allSameCharsString = allSameCharsStrings.stream().collect(Collectors.joining());

		System.out.println("allSameCharsString " + allSameCharsString);

		//To ensure words having all same chars are NOT considered for same max leading and trailing same chars too - BUT are considered only once (say here for all chars same)
		List<String> wordsWithAllSameCharsWordRemoved = List.of(words).stream().filter(s -> !s.equals(!allSameCharsStrings.isEmpty()? allSameCharsStrings.get(0) : "")).collect(Collectors.toList());

		System.out.println("wordsWithAllSameCharsWordRemoved " + wordsWithAllSameCharsWordRemoved);

		//Find index with max trailing same chars
		Optional<String> allSameTrailingCharsStringOptional = wordsWithAllSameCharsWordRemoved.stream().map(s-> getMaxSameTrailingCharsString(s, mostApprearedString))
				.max(Comparator.comparing(String::length));

		String allSameTrailingCharsString = allSameTrailingCharsStringOptional.orElseGet(() -> "");

		System.out.println("allSameTrailingCharsString " + allSameTrailingCharsString);

		//To ensure words having same max leading and trailing same chars are NOT considered twice - for leading and trailing both, BUT are considered only once (say here for trailing)
		List<String> wordsWithMaxTrailingSameCharsWordRemoved = allSameTrailingCharsString.isBlank() ? wordsWithAllSameCharsWordRemoved : wordsWithAllSameCharsWordRemoved.stream().filter(s -> !s.endsWith(allSameTrailingCharsString)).collect(Collectors.toList());

		System.out.println("wordsWithMaxTrailingSameCharsWordRemoved " + wordsWithMaxTrailingSameCharsWordRemoved);

		//Find index with max leading same chars
		Optional<String> allSameLeadingCharsStringOptional = wordsWithMaxTrailingSameCharsWordRemoved.stream().map(s -> getMaxSameLeadingCharsString(s, mostApprearedString))
				.max(Comparator.comparing(String::length));

		String allSameLeadingCharsString = allSameLeadingCharsStringOptional.orElseGet(() -> "");

		System.out.println("allSameLeadingCharsString " + allSameLeadingCharsString);

		String stringContainingLongestSubstring = allSameTrailingCharsString + allSameCharsString + allSameLeadingCharsString;

		System.out.println(stringContainingLongestSubstring);
		System.out.println(stringContainingLongestSubstring.length());
	}


	public static String getMaxSameTrailingCharsString(String s, String mostApprearedString) {
		return Arrays.stream(new StringBuilder(s).reverse().toString().split("")).takeWhile(s1 -> mostApprearedString.equals(s1)).collect(Collectors.joining());
		/*
		String trailingString = "";
		for(int i = s.length()-1; i>=0; i--) {
			if(mostApprearedString.equals(String.valueOf(s.charAt(i)))) {
				trailingString = trailingString + mostApprearedString;
			} else {
				break;
			}
		}
		//System.out.println(trailingString);
		return trailingString;
		*/
	}

	public static String getMaxSameLeadingCharsString(String s, String mostApprearedString) {
		return Arrays.stream(s.split("")).takeWhile(s1 -> mostApprearedString.equals(s1)).collect(Collectors.joining());
		/*
		String startingString = "";
		for(int i = 0; i<=s.length()-1; i++) {
			if(mostApprearedString.equals(String.valueOf(s.charAt(i)))) {
				startingString = startingString + mostApprearedString;
			} else {
				break;
			}
		}
		//System.out.println(startingString);
		return startingString;
		*/
	}


	public static void factorial() {
		int num = 7;
		int fact = IntStream.rangeClosed(2, num).reduce(1, (a,b) -> a*b);
		System.out.println("fact : " + fact);
	}

	public static int getSubString(String s) {

		Map<String, Long> charCounts = Arrays.stream(s.split("")).collect(Collectors.groupingBy(t -> t, Collectors.counting()));
		charCounts = charCounts.entrySet().stream().filter(entry -> entry.getValue()>1).collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), (o, o2) -> o, LinkedHashMap::new));
		charCounts = charCounts.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(), (o, o2) -> o, LinkedHashMap::new));;

		System.out.println("charCounts " + charCounts);

		String string = charCounts.keySet().stream().reduce(s, (s1, s2) -> {
			//System.out.println("s1 " + s1 + " s2 " + s2);
			return removeLongestSubstringWithSameCharAtStartAndEnd(s1, s2);
		});

		System.out.println("String " + string);

		/*
		Optional<String> shortestString = charCounts.keySet().stream().map(s1 -> removeLongestSubstringWithSameCharAtStartAndEnd(s, s1))
				.min(Comparator.comparing(String::length));

		return shortestString.isPresent() ? shortestString.get().length() : 0;
		*/
		return  string.length();
	}

	public static String removeLongestSubstringWithSameCharAtStartAndEnd(String s, String c) {
		System.out.println("String " + s +  " Char " + c);
		List<Integer> indexes = IntStream.range(0, s.length())
				.filter(index -> c.equals(String.valueOf(s.charAt(index)))).boxed().collect(Collectors.toList());
		System.out.println("Indexes " + indexes);
		int lastIndex = 0;
		if(indexes.size() > 2) {
			int indexesSize = indexes.size();
			System.out.println("Indexes Size " + indexesSize);
			for(int i = indexesSize-1; i>1; i--) {
				if(indexes.get(i) - indexes.get(i-1) < 2) {
					lastIndex = indexes.get(i);
					System.out.println("i " + i + " LastIndex " + lastIndex);
					break;
				}
				lastIndex = indexes.get(i-1);
				System.out.println("i " + i + " LastIndex " + lastIndex);
			}
		}
		System.out.println("LastIndex " + lastIndex);
		int subStringEnd = lastIndex != 0 ? lastIndex + 1 : indexes.size() > 0 ? indexes.get(indexes.size()-1) + 1 : 1;
		System.out.println("Substring End " + subStringEnd);

		System.out.println("Regex " + (indexes.size() > 1 ? s.substring(indexes.get(0), subStringEnd) : ""));

		String subString = indexes.size() > 1 ? Arrays.stream(s.split(s.substring(indexes.get(0), subStringEnd))).collect(Collectors.joining()) : s;
		System.out.println("Substring " + subString);
		return subString;
	}

	public static void secondMaxNum() {
		List<Integer> nums = List.of(1, 3, 45, 8, 4,6,1,4, 7, 33);
		Optional<Integer> secondMaxNum = nums.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).limit(1).findFirst();
		System.out.println("2nd max num " + secondMaxNum.orElse(0));

	}

	public static List<Integer> rightSideViewNew(TreeNode root) {
		//Storing level number and TreeNodes at that level
		Map<Integer, List<TreeNode>> rightestNodesPerLevel = new LinkedHashMap<>();
		//Starting from level 0 and root TreeNode at it
		rightestNodesPerLevel.put(0, List.of(root));

		//Looping from level 1 onwards
		IntStream.range(1, Integer.MAX_VALUE)
				// takeWhile runs till CONDITION
				.takeWhile(index -> {
					//For each level, getting the TreeNodes at previous level
					rightestNodesPerLevel.get(index-1)
							.stream()
							//For each TreeNode at previous level
							.forEach(treeNode -> {
								List<TreeNode> nodes = rightestNodesPerLevel.get(index);
								if(nodes==null) {
									//Using LinkedList to maintain the insertion order
									nodes = new LinkedList<>();
								}
								//Getting the right-most children TreeNodes first
								if(treeNode.right!=null)nodes.add(treeNode.right);
								//Then getting the left children TreeNodes
								if(treeNode.left!=null)nodes.add(treeNode.left);

								//If only any nodes found
								if(!nodes.isEmpty())
									//Strong this level and children TreeNodes
									rightestNodesPerLevel.put(index, nodes);

							});
					//CONDITION - Stop at a level where there are NO more children TreeNodes
					return rightestNodesPerLevel.get(index)!=null;
				}).count();

		List<Integer> rightSideView = rightestNodesPerLevel.entrySet().stream()
				//From the level number and TreeNodes map, get only the first TreeNode (right-most) for each level
				.map(entry -> entry.getValue().get(0).val)
				.collect(Collectors.toList());

		System.out.println("RightSideView" + rightSideView);
		return rightSideView;
	}

	public static List<TreeNode> getNodesToBeChecked(List<TreeNode> parentNodes) {
		List<TreeNode> nodesToBeChecked = new LinkedList<>();
		parentNodes.stream().forEach(treeNode -> nodesToBeChecked.addAll(getChildNodes(treeNode)));
		return nodesToBeChecked;

	}
	public static List<TreeNode> getChildNodes(TreeNode parentNode) {
		return List.of(parentNode.right, parentNode.left);
	}


}
