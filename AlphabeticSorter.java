import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabeticSorter{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("CZ - Czech Republic");
        list.add("DK - Denmark");
        list.add("GR - Greece");
        list.add("AU - Australia");
        list.add("FI - Finland");
        list.add("IL - Israel");
        list.add("HU - Hungary");
        list.add("KR - South Korea");
        list.add("NO - Norway");
        list.add("RO - Romania");
        list.add("TH - Thailand");
        list.add("UA - Ukraine");
        list.add("VN - Vietnam");
		list.add("TW - Taiwan");
		list.add("ES - Spain ");
		list.add("CL - Chile");
		list.add("AG - Argentina");
		list.add("MX - Mexico");
		list.add("IE - Ireland");
		list.add("BH - Bahrain");
		list.add("IN - India");
		list.add("KW - Kuwait");
        list.add("CA - Canada");
        list.add("PL - Poland");
		list.add("MA - Morroco");
		list.add("DE - Germany");
		list.add("CH - Switzerland");
		list.add("AT - Austria");
		list.add("BE - Belgium");
		list.add("NL - Netherlands");
		list.add("LU - Luxemburg");
		list.add("OM - Oman");
		list.add("EG - Egypt");
        list.add("SG - Singaore");
        list.add("QA - Qatar");
		list.add("FR - France");
		list.add("MY - Malaysia");
		list.add("SA - Saudi Arabia");
		list.add("GB - Great Britain");
		list.add("ID - Indonesia");
		list.add("SV - Sweden");
		list.add("IT - Italy");
		list.add("PH - Phillipines");
		list.add("TR - Turkey");
        list.add("PE - Peru");
        list.add("EC - Ecuador");

        System.out.println(list);
        Collections.sort(list);
        System.out.println("-----------Sorted List------------");
        System.out.println(list);
    }
}
