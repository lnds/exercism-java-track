import java.util.List;
import java.util.ArrayList;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List result = new ArrayList();
        int i = 0;
        while (i < rnaSequence.length()) {
            String codon = rnaSequence.substring(i, i+3);
            switch (codon) {
                case "AUG":
                    result.add("Methionine");
                    break;
            
                case "UUU": case "UUC":	
                    result.add("Phenylalanine");
                    break;
                case "UUA": case "UUG":
                    result.add("Leucine");
                    break;
                case "UCU": case "UCC": case "UCA": case "UCG":
                    result.add("Serine");
                    break;
                case "UAU": case "UAC":
                    result.add("Tyrosine");
                    break;
                case "UGU": case "UGC":
                    result.add("Cysteine");
                    break;
                case "UGG":
                    result.add("Tryptophan");
                    break;
                case "UAA": case "UAG": case "UGA":
                    return result;
            }
            i += 3;
        }
        return result;
    }
}
