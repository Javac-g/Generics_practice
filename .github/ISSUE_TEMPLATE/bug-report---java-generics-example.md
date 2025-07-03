---
name: Bug Report — Java Generics Example
about: Create a report to help us improve
title: ''
labels: ''
assignees: ''

---

Use this template to help us identify and fix issues related to Java Generics code examples.

---

###  Description

**Describe the bug:**
Clearly explain what’s going wrong — is it a compilation error, runtime issue, incorrect generic logic, or unexpected output?

---

### Steps to Reproduce

If applicable, provide the steps to reproduce the issue. Include:

1. The specific class or method (e.g., `GenericBox<T>`)
2. Sample input or instantiation
3. The outcome or stack trace

Example:

```java
GenericBox<Integer> box = new GenericBox<>("String"); // Should fail at compile time, but doesn't
```

---

###  Expected Behavior

What was the expected output, type behavior, or compile-time validation?

---

### Code Snippet or Screenshot

Please include the relevant code snippet or a screenshot to help us better understand the issue.

---

### Environment

* **JDK Version**: \[e.g., OpenJDK 17, Oracle JDK 21]
* **Build Tool**: \[e.g., Maven, Gradle, IntelliJ]
* **OS**: \[e.g., Ubuntu 24.04, Windows 11]

---

### Additional Context

Add any relevant context, such as:

* Reference to the book section (e.g., Schildt's Generics Chapter: "Bounded Wildcards")
* Link to the file/class in this repo
* Any recent changes made before the bug appeared

---

###  Optional Metadata

* **Issue Title Prefix**: `[Bug - Generics]`
* **Labels**: `bug`, `generics`, `triage`
