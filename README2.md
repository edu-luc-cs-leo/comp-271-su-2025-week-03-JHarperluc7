Week 2 Journal
What is Similar
We both implemented a MinHeap class using an array as the underlying data structure.

Both versions support dynamic resizing of the array when more elements are added.

We each have methods to add elements and to remove the smallest (with re-balancing).

We used heapifyUp() and heapifyDown() to maintain the min-heap property.

Our constructors and supporting methods like leftChild(), rightChild(), and parent() follow the same logic structure.

What Could Be Improved On or Is Different
I added extra safety in getSmallest() to better handle empty arrays — this makes it more robust for edge cases but wasn’t in the original spec.

My heapifyUp() is a bit more broken-down and verbose. The professor's version is cleaner and more compact. They directly reference parent(index) inside the loop, which avoids an extra variable.

I wrote a lot of comments — which helped me follow the flow, but in comparison, the professor's comments are more concise and purpose-driven.

I kept my logic more “stepped out,” which is easier to follow line-by-line but less efficient visually.

The professor’s version feels more “production-ready” — fewer lines, tighter logic, and more consistent formatting.

I may want to refactor some of my helper methods or pull out repeated logic (like resizing the array) into smaller private methods.

Reminder to always check and enforce access modifiers — everything that doesn’t need to be public should stay private.

General Thoughts
I’m still learning how to move between readable code and efficient code. It’s clear from comparing our versions that clarity and brevity can coexist — but it takes practice. I think my code shows I’m careful and cautious, especially with edge cases. That said, I want to push myself toward more elegant structure and naming, and less duplication.

Between work and class, I’m doing a lot of juggling — but I really want to get better at this. Even when I don’t get everything perfect, I know showing up and reflecting honestly matters. It's like a heap — small changes bubble up to big impact.

— Julia