package demo;

public class LowerCase {
    public static void main(String[] args) {
        String url = "Formula SAE Michigan - May";

        // Replace spaces with hyphens
        String hyphenatedCompName = url.toLowerCase().replaceAll(" ", "-");

        // Replace consecutive hyphens with a single hyphen
        hyphenatedCompName = hyphenatedCompName.replaceAll("-+", "-");

        System.out.println(hyphenatedCompName);
    }
}
