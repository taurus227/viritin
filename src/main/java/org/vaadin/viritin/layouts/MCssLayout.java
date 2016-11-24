package org.vaadin.viritin.layouts;

import org.vaadin.viritin.MSize;

import com.vaadin.ui.Component;

public class MCssLayout extends FCssLayout  {

    public MCssLayout() {
    }

    public MCssLayout(Component... children) {
        super(children);
    }

    public MCssLayout withFullWidth() {
        return withWidth("100%");
    }

    public MCssLayout withFullHeight() {
        return withHeight("100%");
    }

    public MCssLayout withSize(MSize size) {
        setWidth(size.getWidth(), size.getWidthUnit());
        setHeight(size.getHeight(), size.getHeightUnit());
        return this;
    }

    public MCssLayout withStyleName(String... styleNames) {
        for (String styleName : styleNames) {
            addStyleName(styleName);
        }
        return this;
    }

    public MCssLayout add(Component... component) {
        addComponents(component);
        return this;
    }

    public MCssLayout withCaption(String caption, boolean captionAsHtml) {
        setCaption(caption);
        setCaptionAsHtml(captionAsHtml);
        return this;
    }

    @Override
    public MCssLayout withWidthFull() {
        return withWidth("100%");
    }

    @Override
    public MCssLayout withHeightFull() {
        return withHeight("100%");
    }
}
