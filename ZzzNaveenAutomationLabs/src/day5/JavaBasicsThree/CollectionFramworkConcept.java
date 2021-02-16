package day5.JavaBasicsThree;

public class CollectionFramworkConcept {

	/* Collection is a framework  - to store and manipulate the groups of objects.
	 * Operations: Searching, Insertion, Manipulation, Deletion, Sorting.
	 * Interfaces in available in Collection: Set, List, Queue, Deque.
	 * Classes available in Collection: ArrayList, Vector, LinkedList, HashSet, TreeSet, PriorityQueue.
	 * Collection is available in Utils package.
	 * 
	 *                                  Iterable[i]
	 *                                      | 
	 *                                      | Extends
	 *                                      |
	 *           ---------------------> Collection <--------------------
	 *           |							|[i]						|
	 *           |	ext						|ext						|ext
	 *           |							|							|
	 *           List[i]				  Queue[i]					   Set[i]
	 *           |						  |	  |						   | |imp
	 *           |<----- ArrayList		  |   |imp       			   | |-----> HashSet[c]
	 *           |	ext		[c]		  Ext |	  PriorityQueue			   | |
	 *           |				  		  |							   | |imp
	 *           |<----- LinkedList ---> DeQueue[i]					ext| |-----> LinkedHashSet[c]
	 *           |	ext		[c]				  |						   |
	 *           |							  |	imp					   |
	 *           |<----- Vector[c]		  ArrayDeque[c]				   |
	 *              ext    |										SortedSet[i]
	 *                     |Ext										   |
	 *                     |										   |imp
	 *                   Stack[c]                    				   |
	 *																 TreeSet[c]
	 *																		
	 *
	 *
	 */													
}
