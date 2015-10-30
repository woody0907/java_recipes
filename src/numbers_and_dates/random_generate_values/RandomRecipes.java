package numbers_and_dates.random_generate_values;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: woody
 * Date: 15-10-30
 * Time: 下午11:13
 * To change this template use File | Settings | File Templates.
 *
 * there are two solutions:
 * (1) use the Random
 * (2) use Math.random()
 */
public class RandomRecipes {

    public static void withRandom() {
//        Random random = new Random();
        /**
         * seed by cunstrctor or by setSeed
         */
        Random random = new Random(100);
//        random.setSeed(100);
        /**
         * the number in the nextX method is the
         * max value of generate result
         */
        System.out.println(random.nextInt(2));
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        System.out.println(random.nextLong());

    }

    public static void withMath() {
        /**
         * the value is [0,1)
         */
        System.out.println(Math.random());
    }

    public static void main(String[] args) {
        withRandom();
        withMath();
    }

}
