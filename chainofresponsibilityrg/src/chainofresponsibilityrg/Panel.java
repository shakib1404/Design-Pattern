package chainofresponsibilityrg;


class Panel extends Container {
    private String modalHelpText;

    public Panel(Container parent, String modalHelpText) {
        super(parent);
        this.modalHelpText = modalHelpText;
    }

    @Override
    public void showHelp() {
        if (modalHelpText != null) {
            System.out.println("Modal Help: " + modalHelpText);
        } else {
            super.showHelp();
        }
    }
}
