package com.mangofactory.swagger.spring;

import com.mangofactory.swagger.ControllerDocumentation;
import com.mangofactory.swagger.models.DocumentationSchemaProvider;
import com.wordnik.swagger.core.Documentation;
import com.wordnik.swagger.core.DocumentationEndPoint;

import static com.mangofactory.swagger.spring.UriExtractor.*;

public class DocumentationEndPoints {
    public static ControllerDocumentation asDocumentation(Documentation parent, DocumentationEndPoint endPoint,
            ControllerAdapter resource, DocumentationSchemaProvider schemaProvider) {
        return new ControllerDocumentation(parent.apiVersion(), parent.swaggerVersion(), parent.basePath(),
                getDocumentationEndpointUri(resource.getControllerClass()), schemaProvider);
    }
}
