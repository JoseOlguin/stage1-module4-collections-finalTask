package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectsList = new ArrayList<>();

        projects.forEach(
            (project, developers) -> {
                if (developers.contains(developer)) {
                    projectsList.add(project);
                }
            }
        );

        projectsList.sort((a, b) -> a.length() == b.length() ? b.compareTo(a) : b.length() - a.length());

        return projectsList;
    }
}
