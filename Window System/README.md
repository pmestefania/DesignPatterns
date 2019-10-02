# Exercise: Window System
_____ Patterns - Decorator Patterns

Description of the problem:

Consider a window in a window system. To allow scrolling of window contents, you may want to add horizontal or vertical scroll bars, as appropriate. Assume that the windows are represented by instances of the Windows interface, and assume that this class has no functionality to add scroll bars. One could create a ScrollingWindow subclass that provides them, or create a ScrollingWindowDecorator that adds this functionality to existing Windows objects. At this point, either solution would be fine. Now, suppose one also wants the possibility of adding borders to the windows. Again, the original Windows class is not supported. The ScrollingWindow subclass now poses a problem, since it has effectively created a new type of window. If you want to add border support to many windows but not all of them, you must create the subclasses WindowWithBorder and ScrollingWindowWithBorder, etc. This problem gets worse with each new feature or subtype of window that will be added. How could you model a solution to this problem.

Class Diagram:
https://www.lucidchart.com/invitations/accept/b38d5129-e8ed-48c4-803d-8161464c8952

# How to Run:

Go to the "Classes" directory and run the following command:
java TestWindowSystem
