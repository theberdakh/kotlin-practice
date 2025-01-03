package structural.decorator

interface CustomView{
    fun draw()
}

class BaseView: CustomView {
    override fun draw() {
        println("Drawing view")
    }
}

abstract class CustomViewDecorator(private val customView: CustomView): CustomView {
    override fun draw() {
        customView.draw()
    }
}

class BorderDecorator(customView: CustomView): CustomViewDecorator(customView){
    override fun draw() {
        super.draw()
        drawBorder()
    }

    private fun drawBorder() {
        println("Drawing border")
    }
}
class ShadowEffect(customView: CustomView): CustomViewDecorator(customView){
    override fun draw() {
        super.draw()
        shadow()
    }

    private fun shadow() {

    }
}