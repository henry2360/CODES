package chapterFive;

    public class AutoPolicy {
        private final String state;
        private int accountNumber;
        private String makeAndModel;

        public AutoPolicy(int accountNumber, String makeAndModel, String state) {
            this.accountNumber = accountNumber;
            this.makeAndModel = makeAndModel;
            this.state = state;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setMakeAndModel(String makeAndModel) {
            this.makeAndModel = makeAndModel;
        }

        public String getMakeAndModel() {
            return makeAndModel;


        }
    }