package ru.javawebinar.webapp.model;

import ru.javawebinar.webapp.model.section.Section;
import ru.javawebinar.webapp.model.section.SectionType;

import java.util.Map;

/**
 * GKislin
 * 29.03.2016
 */
public class Resume {
    String fullName;
    String qualities;
    Map<ContactType, Link> contacts;
    Map<SectionType, Section> sections;
}
