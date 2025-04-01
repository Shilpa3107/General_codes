import numpy as np
import matplotlib.pyplot as plt
from itertools import cycle

# Given data
algorithms = {
    "Random Tree": {
        "TP Rate": [1.000] * 6,
        "FP Rate": [0.000] * 6,
        "ROC Area": [1.000] * 6,
    },
    "Bayes Net": {
        "TP Rate": [0.920, 0.912, 0.881, 0.927, 0.917, 0.899],
        "FP Rate": [0.022, 0.017, 0.018, 0.018, 0.017, 0.017],
        "ROC Area": [0.993, 0.993, 0.992, 0.993, 0.993, 0.993],
    },
    "Naive Bayes": {
        "TP Rate": [0.848, 0.857, 0.827, 0.843, 0.855, 0.831],
        "FP Rate": [0.035, 0.033, 0.031, 0.028, 0.033, 0.029],
        "ROC Area": [0.978, 0.979, 0.977, 0.980, 0.978, 0.978],
    },
    "LWL": {
        "TP Rate": [0.786, 0.993, 0.765, 0.763, 0.766, 0.722],
        "FP Rate": [0.011, 0.214, 0.002, 0.000, 0.002, 0.002],
        "ROC Area": [0.974, 0.971, 0.976, 0.973, 0.972, 0.973],
    },
    "J48": {
        "TP Rate": [0.793, 0.760, 0.683, 0.621, 0.567, 0.557],
        "FP Rate": [0.098, 0.090, 0.077, 0.059, 0.045, 0.034],
        "ROC Area": [0.950, 0.948, 0.945, 0.950, 0.948, 0.954],
    },
}

classes = [
    "Reckless Driving",
    "Drunk Driving",
    "Weather Conditions",
    "Mechanical Failure",
    "Speeding",
    "Distracted Driving",
]

# Colors for different algorithms
colors = cycle(["blue", "green", "red", "purple", "orange"])
plt.figure(figsize=(8, 6))

for (alg_name, data), color in zip(algorithms.items(), colors):
    fpr = [0] + data["FP Rate"] + [1]  # Adding (0,0) and (1,1) for full curve
    tpr = [0] + data["TP Rate"] + [1]
    plt.plot(fpr, tpr, marker="o", linestyle="--", color=color, label=f"{alg_name} (AUC={np.mean(data['ROC Area']):.3f})")

# Random baseline
plt.plot([0, 1], [0, 1], "k--", lw=2, label="Random Guess")
plt.xlabel("False Positive Rate")
plt.ylabel("True Positive Rate")
plt.title("ROC Curve Comparison of Different Algorithms")
plt.legend(loc="lower right")
plt.grid()
plt.show()
