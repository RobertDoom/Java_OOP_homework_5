package Java_OOP_homework_5;

public class DivController {
    View view;
    DivModel divModel;

    public DivController(View view, DivModel divModel) {
        this.view = view;
        this.divModel = divModel;
    }
    public void doDiv(){
        int a = view.getValue();
        int b = view.getValueDiv();
        divModel.setX(a);
        divModel.setY(b);
        int result = divModel.result();
        view.print(result, "Частное: ");
    }
}
