package com.lloydfinch.processor;

import com.google.auto.service.AutoService;
import com.lloydfinch.annotation.BindView;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;
import javax.tools.Diagnostic;

/**
 * Name: BindViewProcessor
 * Author: lloydfinch
 * Function: 对{@link com.lloydfinch.annotation.BindView}注解的扫描处理
 * Date: 2019-11-21 20:43
 * Modify: lloydfinch 2019-11-21 20:43
 */
@AutoService(Processor.class)
public class BindViewProcessor extends AbstractProcessor {

    private String TAG = "BindViewProcessor";

    private Messager mMessager;
    private Elements mElements;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        this.mMessager = processingEnvironment.getMessager();
        this.mElements = processingEnvironment.getElementUtils();
        mMessager.printMessage(Diagnostic.Kind.NOTE, TAG + " init ");
    }


    @Override
    public Set<String> getSupportedAnnotationTypes() {
        Set<String> bindViews = new HashSet<>();
        bindViews.add(BindView.class.getCanonicalName());
        return bindViews;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        mMessager.printMessage(Diagnostic.Kind.NOTE, "processing...");
        mMessager.printMessage(Diagnostic.Kind.NOTE, TAG + " process " + set.size());
        Set<? extends Element> elements = roundEnvironment.getElementsAnnotatedWith(BindView.class);
        for (Element element : elements) {
            VariableElement variableElement = (VariableElement) element;
            TypeElement classElement = (TypeElement) variableElement.getEnclosingElement();
            String className = classElement.getQualifiedName().toString();

            mMessager.printMessage(Diagnostic.Kind.NOTE, TAG + " class name = " + className);
        }

        return true;
    }
}
