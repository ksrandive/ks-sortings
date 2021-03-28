import com.ks.learning.radixSort.RadixSort
import spock.lang.Specification

class RadixSortTest extends Specification {

    def app = new RadixSort()
    def array = [4321, 4423, 2845, 8976, 5647, 6678]

    def "radixSortTest"() {
        when:
        int[] a = app.runRadixSort()
        then:
        a == array.sort()
    }
}
