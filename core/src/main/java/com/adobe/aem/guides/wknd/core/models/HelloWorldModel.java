
package com.adobe.aem.guides.wknd.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(name = "jackson", extensions = "json")
public class HelloWorldModel {

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String richText;

    @ValueMapValue
    private String image;

    private String[] multifield;


    public String getText() {
        return text;
    }

    public String getRichText() {
        return richText;
    }

    public String getImage() {
        return image;
    }

    public String[] getMultifield() {
        return multifield;
    }
}