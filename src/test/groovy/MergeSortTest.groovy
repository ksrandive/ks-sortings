import com.ks.learning.mergeSort.MergeSort
import spock.lang.Specification

class MergeSortTest extends Specification {

    def app = new MergeSort();
    def array = [-55, -20, -10, -1, 1, 12, 15, 18, 55, 80]

    def "mergeSortTest"() {
        when:
        int[] a = app.runMergeSort()
        then:
        a == array
    }
}
