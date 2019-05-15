package org.zkoss.zkspringboot.demo;

import org.zkoss.chart.Charts;
import org.zkoss.chart.Legend;
import org.zkoss.chart.Subtitle;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;


public class AreaMissingComposer extends SelectorComposer<Window> {

    @Wire
    Charts chart;

    public void doAfterCompose(Window comp) throws Exception {
        super.doAfterCompose(comp);

        chart.setModel(AreaMissingData.getCategoryModel());

        Subtitle subtitle = chart.getSubtitle();
        subtitle.setFloating(true);
        subtitle.setAlign("right");
        subtitle.setVerticalAlign("bottom");
        subtitle.setY(15);

        Legend legend = chart.getLegend();
        legend.setLayout("vertical");
        legend.setAlign("left");
        legend.setVerticalAlign("top");
        legend.setX(150);
        legend.setY(100);
        legend.setFloating(true);
        legend.setBorderWidth(1);

        chart.getYAxis().setTitle("Y-Axis");
        chart.getYAxis().getLabels().setFormat("{value}");

        chart.getPlotOptions().getArea().setFillOpacity(0.5);
    }
}