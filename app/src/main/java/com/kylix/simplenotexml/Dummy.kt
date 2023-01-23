package com.kylix.simplenotexml

object Dummy {
    fun getAllNotes() = listOf(
        Note(
            title = "Kotlin Party",
            description = "Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of its standard library depends on the Java Class Library, but type inference allows its syntax to be more concise. Kotlin mainly targets the JVM, but also compiles to JavaScript or native code (via LLVM) for e.g. native iOS apps sharing business logic with Android apps."
        ),
        Note(
            title = "Android Circus",
            description = "Android is a mobile operating system developed by Google. It is based on a modified version of the Linux kernel and other open source software, and is designed primarily for touchscreen mobile devices such as smartphones and tablets. Android is developed by a consortium of developers known as the Open Handset Alliance and commercially sponsored by Google. It was unveiled in November 2007, with the first commercial Android device launched in September 2008."
        ),
        Note(
            title = "Java too old",
            description = "Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible. It is intended to let application developers \"write once, run anywhere\" (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. As of 2019, Java was one of the most popular programming languages in use according to GitHub, particularly for client-server web applications, with a reported 9 million developers."
        ),
        Note(
            title = "Flutter is the best",
            description = "Flutter is Google's UI toolkit for building beautiful, natively compiled applications for mobile, web, and desktop from a single codebase. Flutter works with existing code, is used by developers and organizations around the world, and is free and open source."
        ),
        Note(
            title = "React Native is the best",
            description = "React Native combines the best parts of native development with React, a best-in-class JavaScript library for building user interfaces. With React Native, you use native UI controls and have full access to the native platform."
        ),
        Note(
            title = "KMM still beta?",
            description = "Wanna hear a joke? KMM still in beta version but it's already better than Flutter and React Native. KMM is a framework that allows you to share code between iOS, Android, and the web. It's built on top of Kotlin Multiplatform and is currently in beta. KMM is a framework that allows you to share code between iOS, Android, and the web. It's built on top of Kotlin Multiplatform and is currently in beta."
        ),
        Note(
            title = "Github Copilot make developer lazy",
            description = "Github Copilot is a new AI-powered code completion tool that helps you write code faster. It's built on top of GPT-3, an advanced language model that can generate code based on your existing code. Github Copilot is a new AI-powered code completion tool that helps you write code faster. It's built on top of GPT-3, an advanced language model that can generate code based on your existing code."
        )
    )
}