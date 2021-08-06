package com.hp.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(
			Arrays.asList(new Topic("sping", "Spring Framework", "Spring Framework desc"),
					new Topic("java", "Core Java ", "Spring Framework desc"),
					new Topic("sping", "Spring Framework", "Spring Framework desc")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();

	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (Topic topicupdate : topics) {
			if (topicupdate.getId().equals(id)) {
				topics.set(0, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(x -> x.getId().equals(id));
	}

}
