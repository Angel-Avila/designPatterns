package mx.iteso.singleton;


public class ChocolateFactoryLazy {
        private static final ChocolateFactoryLazy Chocolatehot = new ChocolateFactoryLazy();
        private boolean empty;
        private boolean boiled;

        private ChocolateFactoryLazy() {
            empty = true;
            boiled = false;
        }
        public synchronized void fill() {
            if (isEmpty()) {
                empty = false;
                boiled = false;
                // fi ll the boiler with a milk/chocolate mixture
            }
        }
        public synchronized void drain() {
            if (!isEmpty() && isBoiled()) {
                // drain the boiled milk and chocolate
                empty = true;
            }
        }
        public synchronized void boil() {
            if (!isEmpty() && !isBoiled()) {
                // bring the contents to a boil
                boiled = true;
            }
        }
        public static ChocolateFactoryLazy getInstance(){
            return Chocolatehot;
        }

        public synchronized boolean isEmpty() {
            return empty;
        }
        public synchronized boolean isBoiled() {
            return boiled;
        }
    }

